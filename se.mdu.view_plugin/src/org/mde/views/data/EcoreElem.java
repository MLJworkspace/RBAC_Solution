package org.mde.views.data;

import org.eclipse.emf.ecore.EObject;

public class EcoreElem {
	private String type = null;
	private String name = null;
	private EObject obj = null;
	public EcoreElem(String typ, String namn, EObject ob){
		type = typ;
		name = namn;
		obj = ob;
	}
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	
	public EObject getEObject(){
		return obj;
	}
}
