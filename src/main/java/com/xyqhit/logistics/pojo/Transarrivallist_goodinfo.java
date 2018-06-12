package com.xyqhit.logistics.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="transarrivallist_goodinfo")
public class Transarrivallist_goodinfo { //抵达商品信息
    private String primarykey; //编号

    private String number; //包裹编号

    private String state; //商品状态

    private String id; // --> Transarrivallist //车辆抵达id

   //@Id
	public String getPrimarykey() {
		return primarykey;
	}

	public void setPrimarykey(String primarykey) {
		this.primarykey = primarykey;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Transarrivallist_goodinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}