package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="staff")
public class Staff { //员工
    private String id; //编号

    private String name; //姓名

    private String sex; //性别

    private String position; //职位 工资根据工龄 基本工资 绩效 扣工资 实上班时间计算
	//基本工资*（实上班时间/应上班时间）+工龄*（一年应涨工资）+绩效-处罚
	// 绩效 根据职位确定绩效算法


    private String idnumber; //身份证号

    private Date workingstarttime; //工作开始时间

    private String phonenum; //电话

   // private String wage; //工资

  //  private String agencyname; //机构名称

    private String agencyid; //网点编号 --> Agency

   // @Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public Date getWorkingstarttime() {
		return workingstarttime;
	}

	public void setWorkingstarttime(Date workingstarttime) {
		this.workingstarttime = workingstarttime;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getAgencyid() {
		return agencyid;
	}

	public void setAgencyid(String agencyid) {
		this.agencyid = agencyid;
	}

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

   
}