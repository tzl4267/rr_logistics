package com.xyqhit.logistics.pojo;
//转运清单 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="transshipmentlist_barcode")
public class Transshipmentlist_barcode {
    private String primarykey; 

    private String number; //包裹 编号

    private String id; //转运清单 id

    private String state; //商品状态

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Transshipmentlist_barcode() {
		super();
		// TODO Auto-generated constructor stub
	}

   
}