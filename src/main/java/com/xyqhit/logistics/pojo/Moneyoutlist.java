package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="moneyoutlist")
public class Moneyoutlist { //付款管理
    private String id; //编号

	private String orderNumber; //订单编号

    private Date timee; //付款日期

    private Double money; //付款金额

    private String payer; //付款人

    private String payType;//付款方式 现金、银行转账

    private String clause; //付款条目

    private String note; //备注

    private String checkstate; //状态

    
    //@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getTimee() {
		return timee;
	}

	public void setTimee(Date timee) {
		this.timee = timee;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getClause() {
		return clause;
	}

	public void setClause(String clause) {
		this.clause = clause;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCheckstate() {
		return checkstate;
	}

	public void setCheckstate(String checkstate) {
		this.checkstate = checkstate;
	}

	public Moneyoutlist() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}