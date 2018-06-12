package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity
//@Table(name="driver")
public class Driver { //司机
    private String drivernum; //司机编号

    private String name; //姓名
    
    private Integer age; //年龄

    private String idnum; //身份证号

    private String phonenum; //电话号码

    private String sex; //性别

    private Date drivinglicenceperiod; //驾驶证期限

    //@Id
	public String getDrivernum() {
		return drivernum;
	}

	public void setDrivernum(String drivernum) {
		this.drivernum = drivernum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getIdnum() {
		return idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDrivinglicenceperiod() {
		return drivinglicenceperiod;
	}

	public void setDrivinglicenceperiod(Date drivinglicenceperiod) {
		this.drivinglicenceperiod = drivinglicenceperiod;
	}

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}