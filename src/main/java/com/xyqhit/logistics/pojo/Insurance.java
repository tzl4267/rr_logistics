package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Insurance {//保险管理


	private String  id;//


	private String vehiclecode;//车 辆代号


	private String insuranceType;//保险类型

	private Double money;//保险金额
	

	private Date expireTime;//到期时间


	private Date insureTime;//投保时间


	//@Id
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getVehiclecode() {
		return vehiclecode;
	}


	public void setVehiclecode(String vehiclecode) {
		this.vehiclecode = vehiclecode;
	}


	public String getInsuranceType() {
		return insuranceType;
	}


	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}


	public Double getMoney() {
		return money;
	}


	public void setMoney(Double money) {
		this.money = money;
	}


	public Date getExpireTime() {
		return expireTime;
	}


	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}


	public Date getInsureTime() {
		return insureTime;
	}


	public void setInsureTime(Date insureTime) {
		this.insureTime = insureTime;
	}


	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}