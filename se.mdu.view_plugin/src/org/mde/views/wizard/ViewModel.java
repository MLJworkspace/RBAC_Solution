package org.mde.views.wizard;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Tree;
import org.mde.views.roleuser.wizard.RolePage;

/** Class defining the data model in which information regarding
* the new view is stored
* @author Federico Ciccozzi 
*/
public class ViewModel 
{
	/** Name of the new view */
	static String viewName; 
	
	/** NameSpace the new view */
	static String ns;
	
	/** NameSpace URI the new view */
	static String nsURI;
	
	static String selectedPath;
	
	/** Selected roles with access to the new view */
	public List<RolePage.Role> selectedRoles = new ArrayList<>();
	
	/** Smart auto-selection of meta-model items */
	static boolean auto = false;

	/** View elements tree */
	static Tree tree;
	
	/** Resource for managing models */
	static Resource resource;
	
	/** View-complete flag */
	static boolean isComplete = false;
	
}
