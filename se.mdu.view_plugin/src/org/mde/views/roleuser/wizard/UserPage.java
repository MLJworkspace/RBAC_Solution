
package org.mde.views.roleuser.wizard;



import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.eclipse.swt.widgets.Combo;
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
import org.mde.views.roleuser.wizard.RolePage.Role;
import org.mde.views.wizard.ViewWizard;
import org.mindrot.jbcrypt.BCrypt;
/** Class defining presentation and business layer of
* the wizard page for typing the general information about
* the view
* @author Malvina Latifaj
*/
public class UserPage extends WizardPage implements Listener{
    
	IWorkbench workbench;
	IStructuredSelection selection;
	 private Text nameText;
	    private Text surnameText;
	    private Text usernameText;
	    private Text emailText;
	    private Text passwordText;
	    public TableViewer tableViewer;
	    public List<User> userList;
	    private File dataFile;
	    private User selectedUser;
	    private Button saveButton;
	    private Button deleteButton;
	    private Combo roleCombo;
	    private List<RolePage.Role> roleList;

	    public UserPage(IWorkbench workbench, IStructuredSelection selection, List<RolePage.Role> roleList) {
	        super("Page1");
	        setTitle("Create User");
	        setDescription("Provide the details of the user");
	        this.workbench = workbench;
	        this.selection = selection;	  
	        userList = new ArrayList<>();
	        dataFile = new File("user_data.ser"); // File to store user data
	   
	        loadUserData(); // Load existing user data from the file
	    
	       
	     // Instantiate RolePage and retrieve the roleList
	        this.roleList = roleList;
	    }


	    public void createControl(Composite parent) {
	        Composite composite = new Composite(parent, SWT.NULL);
	        composite.setLayout(new GridLayout(2, false));

	        new Label(composite, SWT.NONE).setText("Name:");
	        nameText = new Text(composite, SWT.BORDER);
	        nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

	        new Label(composite, SWT.NONE).setText("Surname:");
	        surnameText = new Text(composite, SWT.BORDER);
	        surnameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

	        new Label(composite, SWT.NONE).setText("Username:");
	        usernameText = new Text(composite, SWT.BORDER);
	        usernameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

	        new Label(composite, SWT.NONE).setText("Email:");
	        emailText = new Text(composite, SWT.BORDER);
	        emailText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	        
	        new Label(composite, SWT.NONE).setText("Password:");
	        passwordText = new Text(composite, SWT.PASSWORD | SWT.BORDER);
	        passwordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));        
	        
	        new Label(composite, SWT.NONE).setText("Role:");
	        roleCombo = new Combo(composite, SWT.READ_ONLY);
	        roleCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	        // Populate the combo box with role names
	        for (Role role : roleList) {
	            roleCombo.add(role.getRoleName());
	        }
	        saveButton = new Button(composite, SWT.PUSH);
	        saveButton.setText("Save");
	        saveButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
	        saveButton.addListener(SWT.Selection, this);

	        deleteButton = new Button(composite, SWT.PUSH);
	        deleteButton.setText("Delete");
	        deleteButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
	        deleteButton.setEnabled(false);
	        deleteButton.addListener(SWT.Selection, this);

	        tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
	        Table table = tableViewer.getTable();
	        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
	        table.setHeaderVisible(true);
	        table.setLinesVisible(true);

	        TableLayout tableLayout = new TableLayout();
	        table.setLayout(tableLayout);

	        TableColumn nameColumn = new TableColumn(table, SWT.NONE);
	        nameColumn.setText("Name");

	        TableColumn surnameColumn = new TableColumn(table, SWT.NONE);
	        surnameColumn.setText("Surname");

	        TableColumn usernameColumn = new TableColumn(table, SWT.NONE);
	        usernameColumn.setText("Username");

	        TableColumn emailColumn = new TableColumn(table, SWT.NONE);
	        emailColumn.setText("Email");
            
	        TableColumn roleColumn = new TableColumn(table, SWT.NONE);
	        roleColumn.setText("Role"); 
	        
	        tableViewer.setContentProvider(ArrayContentProvider.getInstance());
	        tableViewer.setLabelProvider(new UserLabelProvider());
	     
	        // Load existing users from the list
	        tableViewer.setInput(userList);

	        // Add selection listener to the table
	        tableViewer.getTable().addListener(SWT.Selection, this);

	        // Pack the columns to distribute the available space evenly
	        tableLayout.addColumnData(new ColumnWeightData(20, true));
	        tableLayout.addColumnData(new ColumnWeightData(20, true));
	        tableLayout.addColumnData(new ColumnWeightData(20, true));
	        tableLayout.addColumnData(new ColumnWeightData(20, true));
	        tableLayout.addColumnData(new ColumnWeightData(20, true));
	      
	        setControl(composite);
	    }
	    public List<User> getUserList() {
	        return userList;
	    }

	    public void handleEvent(Event event) {
	        if (event.widget instanceof Button) {
	            Button button = (Button) event.widget;
	            if (button == saveButton) {
	                saveUser();
	            } else if (button == deleteButton) {
	                deleteUser();
	            }
	        } else if (event.widget instanceof Table) {
	            Table table = (Table) event.widget;
	            if (table == tableViewer.getTable()) {
	                TableItem[] selection = tableViewer.getTable().getSelection();
	                if (selection.length > 0) {
	                    selectedUser = (User) selection[0].getData();
	                    displaySelectedUserDetails();
	                    deleteButton.setEnabled(true);
	                } else {
	                    selectedUser = null;
	                    clearFields();
	                    deleteButton.setEnabled(false);
	                }
	            }
	        }	        
	    }
	
	    private void saveUser() {
	        String name = nameText.getText();
	        String surname = surnameText.getText();
	        String username = usernameText.getText();
	        String email = emailText.getText();
	        String password = passwordText.getText();
	        int selectedIndex = roleCombo.getSelectionIndex();
	        Role role = roleList.get(selectedIndex);
	     

	        if (name.isEmpty() || surname.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty()) {
	            MessageBox messageBox = new MessageBox(getShell(), SWT.ICON_WARNING);
	            messageBox.setText("Incomplete Fields");
	            messageBox.setMessage("Please fill in all the fields.");
	            messageBox.open();
	            return;
	        }
	        // Generate a salt for bcrypt
	        String salt = BCrypt.gensalt();

	        // Hash the password using bcrypt
	        String hashedPassword = BCrypt.hashpw(password, salt);
	        

	        User user = new User(name, surname, username, email, hashedPassword, role);

	        if (selectedUser == null) {
	            // Add new user to the list
	            userList.add(user);
	        } else {
	            // Update existing user in the list
	            int index = userList.indexOf(selectedUser);
	            if (index != -1) {
	                userList.set(index, user);
	            }
	            selectedUser = null;
	        }
	     
	        // Refresh the table viewer with the updated user list
	        tableViewer.refresh();

	        // Clear input fields
	        clearFields();
           
	        // Save the updated user list to the file
	        saveUserData();
	   
	    }

	    private void deleteUser() {
	        if (selectedUser != null) {
	            userList.remove(selectedUser);
	            selectedUser = null;
	            tableViewer.refresh();
	            saveUserData();
	            clearFields();  
	        }
	    }
	    private void displaySelectedUserDetails() {
	        nameText.setText(selectedUser.getName());
	        surnameText.setText(selectedUser.getSurname());
	        usernameText.setText(selectedUser.getUsername());
	        emailText.setText(selectedUser.getEmail());
	        passwordText.setText(selectedUser.getPassword());
	        if (selectedUser.getRole() != null) {
	        roleCombo.setText(selectedUser.getRole().getRoleName());
	        }
	    }

	    private void clearFields() {
	        nameText.setText("");
	        surnameText.setText("");
	        usernameText.setText("");
	        emailText.setText("");
	        passwordText.setText("");
	        roleCombo.deselectAll();
	    }
	    
	    private void saveUserData() {
	        try (FileOutputStream fileOutputStream = new FileOutputStream(dataFile);
	             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
	            objectOutputStream.writeObject(userList);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private void loadUserData() {
	        if (dataFile.exists()) {
	            try (FileInputStream fileInputStream = new FileInputStream(dataFile);
	                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
	                userList = (List<User>) objectInputStream.readObject();
	            } catch (IOException | ClassNotFoundException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	
	    public static class User implements Serializable {
	        private String name;
	        private String surname;
	        private String username;
	        private String email;
	        private String password;
	        private Role role;

	        public User(String name, String surname, String username, String email, String password, Role role) {
	            this.name = name;
	            this.surname = surname;
	            this.username = username;
	            this.email = email;
	            this.password = password;
	            this.role = role;	           
	        }

	        public String getName() {
	            return name;
	        }

	        public String getSurname() {
	            return surname;
	        }

	        public String getUsername() {
	            return username;
	        }

	        public String getEmail() {
	            return email;
	        }
	        
	        public String getPassword() {
	            return password;
	        }
	        public Role getRole() {
	            return role;
	        }
	        public void setRole(Role role) {
	            this.role = role;
	        }
	    }

	    private static class UserLabelProvider extends LabelProvider implements ITableLabelProvider {
	        public String getColumnText(Object element, int columnIndex) {
	            User user = (User) element;
	            switch (columnIndex) {
	                case 0:
	                    return user.getName();
	                case 1:
	                    return user.getSurname();
	                case 2:
	                    return user.getUsername();
	                case 3:
	                    return user.getEmail();             
	                case 4:
	                	if (user.getRole()!= null) {
	                	return user.getRole().getRoleName();
	                	}
	                default:
	                    return "";
	            }
	        }
	       
	        public Image getColumnImage(Object element, int columnIndex) {
	            return null;
	        }
	    }
	}