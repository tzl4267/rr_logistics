package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Hallarrivallist { //接收 HallArrivalList
    private String id; //编号

    private Date timee; //到达日期

    private String transfernumber; //中转单号 transferNumber

   // private String departureplace; //出发地departurePlace

    private String checkstate; //货物到达状态

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

    public String getTransfernumber() {
        return transfernumber;
    }

    public void setTransfernumber(String transfernumber) {
        this.transfernumber = transfernumber;
    }

    public String getCheckstate() {
        return checkstate;
    }

    public void setCheckstate(String checkstate) {
        this.checkstate = checkstate;
    }

	public Hallarrivallist() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}