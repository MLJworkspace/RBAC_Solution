package org.mde.views.roleuser.wizard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.mde.views.roleuser.wizard.RolePage.Role;
import org.mde.views.roleuser.wizard.UserPage.User;

/** Class defining the wizard for the creation of the RoleWi
* @author Malvina Latifaj
*/
public class RoleWizard extends Wizard implements INewWizard
{	
	// wizard pages
	RolePage rolePage;
		
	IPath path;
	IFile file;
	
	// workbench selection when the wizard was started
	protected IStructuredSelection selection;
	
	// the workbench instance
	protected IWorkbench workbench;
    List<UserPage.User> userList;
 
	// Constructor for RoleWizard.
	public RoleWizard(IPath path, IFile file) {
		super();
		this.path = path;
		this.file = file;
	}		
	// Pages added to the wizard
	public void addPages()
	{  	  
		rolePage = new RolePage(workbench, selection);
		addPage(rolePage);	
	}

	/**
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		this.workbench = workbench;
		this.selection = selection;
	}

	
	
    //Finalize the wizard and the newly created view     
    public boolean performFinish() {
        updateUserRoles();
        return true;
    }
    
    //Method to update the role value of the user in UserPage.java 
    //If the role is modified or deleted in RolePage.java  
    private void updateUserRoles() {
        List<User> userList = loadUserData();
        for (User user : userList) {
        	if (user.getRole() != null) {
	            Role role = user.getRole();   
	            int currentIndex = -1;
	            //For when the role is modified
	            for (Role previous : RolePage.previousRoles) {              
	            	if ((previous.getRoleName().equals(role.getRoleName()))) {
	            		currentIndex = RolePage.previousRoles.indexOf(previous);
	            		user.setRole(RolePage.modifiedRoles.get(currentIndex));
	            	}
	            }
	            //For when the role is deleted
	            for ( Role deleted : RolePage.deletedRoles) {
		            if ((deleted.getRoleName()).equals(role.getRoleName())) {           	
		                user.setRole(null);
		            }            
	            }   
        	}
        }
        // Save updated user data to file
        saveUserData(userList);
    }

    // Method to load user data from file
    @SuppressWarnings("unchecked")
	private List<User> loadUserData() {
        List<User> userList = new ArrayList<>();
        File dataFile = new File("user_data.ser");
        if (dataFile.exists()) {
            try (FileInputStream fileInputStream = new FileInputStream(dataFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            	userList = (List<User>) objectInputStream.readObject();
            } 
            catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return userList;
    }
    // Method to save user data to file
    private void saveUserData(List<User> userList) {
        File dataFile = new File("user_data.ser");
        try (FileOutputStream fileOutputStream = new FileOutputStream(dataFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(userList);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}