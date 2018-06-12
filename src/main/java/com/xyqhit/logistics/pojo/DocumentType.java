package com.xyqhit.logistics.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="documentType")
public class DocumentType { //证件类型

    private String  did; //证件类型id
    
   	private String dName;//证件类型名称

   	//@Id
	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public DocumentType() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}