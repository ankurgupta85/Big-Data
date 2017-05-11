package com.ankur.model.json;

import java.io.Serializable;

public class WorldBankProjectDocs implements Serializable{

	private String DocTypeDesc;
	private String EntityID;
	private String DocType;
	private String DocDate; 
	private String DocURL;
	public String getDocTypeDesc() {
		return DocTypeDesc;
	}
	public void setDocTypeDesc(String docTypeDesc) {
		DocTypeDesc = docTypeDesc;
	}
	public String getEntityID() {
		return EntityID;
	}
	public void setEntityID(String entityID) {
		EntityID = entityID;
	}
	public String getDocType() {
		return DocType;
	}
	public void setDocType(String docType) {
		DocType = docType;
	}
	public String getDocDate() {
		return DocDate;
	}
	public void setDocDate(String docDate) {
		DocDate = docDate;
	}
	public String getDocURL() {
		return DocURL;
	}
	public void setDocURL(String docURL) {
		DocURL = docURL;
	}
	
	
	
	
}
