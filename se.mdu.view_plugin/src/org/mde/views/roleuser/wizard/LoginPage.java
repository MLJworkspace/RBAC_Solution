package org.mde.views.roleuser.wizard;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.mde.views.roleuser.wizard.UserPage.User;
import org.mindrot.jbcrypt.BCrypt;
import org.eclipse.jface.dialogs.IDialogConstants;


	
	public class LoginPage extends WizardPage implements Listener{
	    IWorkbench workbench;
	    IStructuredSelection selection;
	    private Text userNameText, passwordText;
	    private Button signInButton;
	    
	    public LoginPage(IWorkbench workbench, IStructuredSelection selection) {
	        super("LoginPage");
	        setTitle("Sign in");
	        setDescription("Sign in with your username and password.");
	        this.workbench = workbench;
	        this.selection = selection;   
	    }

	    @Override
	    public void createControl(Composite parent) {
	        Composite composite = new Composite(parent, SWT.NULL);
	        composite.setLayout(new GridLayout(1, false)); 

	        //Add UserName
	        new Label(composite, SWT.NONE).setText("Username:");
	        userNameText = new Text(composite, SWT.BORDER);
	        userNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

	        //Add Password
	        new Label(composite, SWT.NONE).setText("Password:");
	        passwordText = new Text(composite, SWT.PASSWORD);
	        passwordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

	        //Add sign in button
	        signInButton = new Button(composite, SWT.PUSH);
	        signInButton.setText("Sign in");
	        signInButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
	        signInButton.addListener(SWT.Selection, this);
	        
	        //Setting the wizard page's control
	        setControl(composite);
	    }
	

	    @Override
	    public void handleEvent(Event event) {
	        if (event.widget == signInButton) {
	            String username = userNameText.getText();
	            String password = passwordText.getText();
	            List<User> users = new ArrayList<>();
	            try {
	                FileInputStream fis = new FileInputStream("user_data.ser");
	                ObjectInputStream ois = new ObjectInputStream(fis);
	                users = (List<User>) ois.readObject();
	                ois.close();
	                fis.close();
	            } catch(Exception e) {
	                e.printStackTrace();
	            }

	            User currentUser = users.stream()
	                .filter(user -> user.getUsername().equals(username))
	                .findFirst()
	                .orElse(null);

	            if (currentUser != null && BCrypt.checkpw(password, currentUser.getPassword())) {
	                // the password is correct, do something here
	            	//provide access to models conforming to the view
	            	getWizard().getContainer().getShell().close();
	            } else {
	                // the password is incorrect, show error message
	                setErrorMessage("The username or password is incorrect.");
	            }
	        }
	    }
	}

