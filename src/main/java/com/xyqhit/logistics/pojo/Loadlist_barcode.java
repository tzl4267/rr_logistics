package com.xyqhit.logistics.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Loadlist_barcode { //运输清单条形码
    private String primarykey; //编号

    private String orderNumber; //订单编号

    private String transportationnumber; //运输编号 

    
    //@Id
	public String getPrimarykey() {
		return primarykey;
	}

	public void setPrimarykey(String primarykey) {
		this.primarykey = primarykey;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getTransportationnumber() {
		return transportationnumber;
	}

	public void setTransportationnumber(String transportationnumber) {
		this.transportationnumber = transportationnumber;
	}

	public Loadlist_barcode() {
		super();
		// TODO Auto-generated constructor stub
	}

   
}