package com.xyqhit.logistics.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="agency")
public class Agency { //机构 代理 网点
    private String agencyId; //机构编号

    private String agencyName; //机构名称  地址 襄樊市樊城区建设路257号


	private String cid;//城市id

	private String cType;//网点类别

	//@Id
	public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public Agency() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
   
}