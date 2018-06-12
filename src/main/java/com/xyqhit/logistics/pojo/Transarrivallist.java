package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity
//@Table(name="Transarrivallist")
public class Transarrivallist { //车辆抵达表
    private String id;

    private String transfernumber; //转运表 id

    private String centernumber; //抵达（网点编号）

    private Date timee; //抵达时间

    private String departureplace; //出发地

    private String checkstate; //抵达状态

    //@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCenternumber() {
		return centernumber;
	}

	public void setCenternumber(String centernumber) {
		this.centernumber = centernumber;
	}

	public Date getTimee() {
		return timee;
	}

	public void setTimee(Date timee) {
		this.timee = timee;
	}

	public String getDepartureplace() {
		return departureplace;
	}

	public void setDepartureplace(String departureplace) {
		this.departureplace = departureplace;
	}

	public String getCheckstate() {
		return checkstate;
	}

	public void setCheckstate(String checkstate) {
		this.checkstate = checkstate;
	}

	public String getTransfernumber() {
		return transfernumber;
	}

	public void setTransfernumber(String transfernumber) {
		this.transfernumber = transfernumber;
	}

	public Transarrivallist() {
		super();
		// TODO Auto-generated constructor stub
	}

  
}