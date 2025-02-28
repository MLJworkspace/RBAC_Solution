package org.mde.views.roleuser.wizard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

/** Class defining presentation and business layer of
* the role page for typing the general information about
* roles
* 
* @author Malvina Latifaj
*/
public class RolePage extends WizardPage implements Listener{
	IWorkbench workbench;
	IStructuredSelection selection;
	private Text roleNameText, roleDescriptionText;
    private TableViewer tableViewer;
    private File dataFile;
    public Role selectedRole;
    private Button saveButton, deleteButton;
    List<Role> roleList = new ArrayList<>();
    static List<Role> deletedRoles = new ArrayList<>();
    static List<Role> previousRoles = new ArrayList<>();
    static List<Role> modifiedRoles = new ArrayList<>();
	    
    public RolePage(IWorkbench workbench, IStructuredSelection selection) {
        super("Page1");
        setTitle("Role");
        setDescription("Create a new role or select a role to modify or delete.");
        this.workbench = workbench;
        this.selection = selection;      
        dataFile = new File("role_data.ser");
        loadRoleData(); 
    }
    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NULL);
        composite.setLayout(new GridLayout(2, false));
        
        //Add role name
        new Label(composite, SWT.NONE).setText("Role:");
        roleNameText = new Text(composite, SWT.BORDER);
        roleNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        
        //Add role description
        new Label(composite, SWT.NONE).setText("Role description:");
        roleDescriptionText = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
        GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
        gridData.heightHint = roleDescriptionText.getLineHeight() * 4; 
        roleDescriptionText.setLayoutData(gridData);
        
        //Add table
        tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
        Table table = tableViewer.getTable();
        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        TableLayout tableLayout = new TableLayout();
        table.setLayout(tableLayout);
        TableColumn nameColumn = new TableColumn(table, SWT.NONE);
        nameColumn.setText("Existing roles");
        tableViewer.setContentProvider(ArrayContentProvider.getInstance());
        tableViewer.setLabelProvider(new UserLabelProvider());
        tableViewer.setInput(roleList);
        tableViewer.getTable().addListener(SWT.Selection, this);
        tableLayout.addColumnData(new ColumnWeightData(25, true));
        
        //Add save and delete buttons 
        saveButton = new Button(composite, SWT.PUSH);
        saveButton.setText("Save");
        saveButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
        saveButton.addListener(SWT.Selection, this);
        deleteButton = new Button(composite, SWT.PUSH);
        deleteButton.setText("Delete");
        deleteButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
        deleteButton.setEnabled(false);
        deleteButton.addListener(SWT.Selection, this);
        setControl(composite);
    }

    public void handleEvent(Event event) {
        if (event.widget instanceof Button) {
            Button button = (Button) event.widget;
            if (button == saveButton) {
                saveRole();
            } else if (button == deleteButton) {
                deleteRole();
            }
        } 
        else if (event.widget instanceof Table) {
            Table table = (Table) event.widget;
            if (table == tableViewer.getTable()) {
                TableItem[] selection = tableViewer.getTable().getSelection();
                if (selection.length > 0) {
                    selectedRole = (Role) selection[0].getData();
                    displaySelectedRoleDetails();
                    deleteButton.setEnabled(true);
                } else {
                    selectedRole = null;
                    clearFields();
                    deleteButton.setEnabled(false);
                }
            }
        }
    }
    private void saveRole() {
        String roleName = roleNameText.getText();
        String roleDescription = roleDescriptionText.getText();
        if (roleName.isEmpty() || roleDescription.isEmpty()) {
            MessageBox messageBox = new MessageBox(getShell(), SWT.ICON_WARNING);
            messageBox.setText("Incomplete Fields");
            messageBox.setMessage("Please fill in all the fields.");
            messageBox.open();
            return;
        }
        Role role = new Role(roleName, roleDescription);
        if (selectedRole == null) {
            roleList.add(role);
        } 
        else {
            previousRoles.add(selectedRole);
            if (!selectedRole.getRoleName().equals(roleName) || !selectedRole.getRoleDescription().equals(roleDescription)) {
                modifiedRoles.add(role); 
            }
            int index = roleList.indexOf(selectedRole);
            if (index != -1) {
                roleList.set(index, role);
            }
            selectedRole = null;
        }
        tableViewer.refresh();
        clearFields();
        saveRoleData();
    }  
    private void deleteRole() {
        if (selectedRole != null) {
            deletedRoles.add(selectedRole); 
            roleList.remove(selectedRole);
            selectedRole = null;
            tableViewer.refresh();
            saveRoleData();
            clearFields();
            deleteButton.setEnabled(false);
        }
    }
    public List<Role> getPreviousRoles() {
        return previousRoles;
    }   
    public List<Role> getDeletedRoles() {
        return deletedRoles;
    }
    public List<Role> getModifiedRoles() {
        return modifiedRoles;
    }
    public List<Role> getRoleList() {
        return roleList;
    }
    private void displaySelectedRoleDetails() {
        roleNameText.setText(selectedRole.getRoleName());
        roleDescriptionText.setText(selectedRole.getRoleDescription ());
    }
    private void clearFields() {
        roleNameText.setText("");
        roleDescriptionText.setText("");
    }
    private void saveRoleData() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(dataFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(roleList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
	public void loadRoleData() {
        if (dataFile.exists()) {
            try (FileInputStream fileInputStream = new FileInputStream(dataFile);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                roleList = (List<Role>) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }	   
	public static class Role implements Serializable {
        private String roleName;
        private String roleDescription;	       
        public Role(String roleName, String roleDescription) {
            this.roleName = roleName;
            this.roleDescription = roleDescription;
        }
        public String getRoleName() {
            return roleName;
        }
        public String getRoleDescription() {
            return roleDescription;
        }
    }
    private static class UserLabelProvider extends LabelProvider implements ITableLabelProvider {
        public String getColumnText(Object element, int columnIndex) {
            Role role = (Role) element;
            switch (columnIndex) {
                case 0:
                    return role.getRoleName();
                case 1:
                    return role.getRoleDescription();
                default:
                    return "";
            }
        }

    public Image getColumnImage(Object element, int columnIndex) {
        return null;
    }
    }
}