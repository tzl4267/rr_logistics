package com.xyqhit.logistics.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class GoodsType { //货品类型

    private String gid; //货品类型id
    
    private String gName; //货品类型名称

   // @Id
	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public GoodsType() {
		super();
		// TODO Auto-generated constructor stub
	}

   

	
    
}