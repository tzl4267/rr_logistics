package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="transshipmentlist")
public class Transshipmentlist { //转运表
    private String id; 

    private Date timee; //转运日期

    private String flightnumber; //航班号

    private String vehiclecode;//车辆编号

    private String departureplace; //出发地

    private String destination; //目的地

    private String containernumber; //货柜号

    private String supercargo; //监管员

   // private Double price; //运费

    private String checkstate; //转运状态

   // @Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getTimee() {
		return timee;
	}

	public void setTimee(Date timee) {
		this.timee = timee;
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public String getVehiclecode() {
		return vehiclecode;
	}

	public void setVehiclecode(String vehiclecode) {
		this.vehiclecode = vehiclecode;
	}

	public String getDepartureplace() {
		return departureplace;
	}

	public void setDepartureplace(String departureplace) {
		this.departureplace = departureplace;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getContainernumber() {
		return containernumber;
	}

	public void setContainernumber(String containernumber) {
		this.containernumber = containernumber;
	}

	public String getSupercargo() {
		return supercargo;
	}

	public void setSupercargo(String supercargo) {
		this.supercargo = supercargo;
	}

	public String getCheckstate() {
		return checkstate;
	}

	public void setCheckstate(String checkstate) {
		this.checkstate = checkstate;
	}

	public Transshipmentlist() {
		super();
		// TODO Auto-generated constructor stub
	}

 
}