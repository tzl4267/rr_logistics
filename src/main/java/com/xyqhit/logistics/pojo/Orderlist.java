package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity
//@Table(name="orderlist")
public class Orderlist { // 订单/结算
    private String barcode; //订单条码

	private String orderNumber;//订单编号

    private String sendername; //发件人名

    private String senderaddress; //发货地址

    private String sendertelenumber; //发货人电话

    private String receivername; //收件人名

    private String receiveraddress; //收件地址

    private String receivertelenumber; //收件人电话

    private Integer number; //物品数量 默认1

    private Double weight; //重量 默认0

    private Double volume; //体积 默认0

    private String name; //

    private String category; //类别

    private Double packprice; //(包装费)

    private String pkgtype; //包裹类别

    private Date departtime; //出发时间

    private Date arrivetime; //到达时间

    private String checkstate; //是否达到 

    private String realreceivertelenumber; //接收营业厅编号/网点编号

	private String stuffId;//揽件用户，关联员工

	private String stus;//订单状态 初始为0 ，使用为1

	private String urgent;//是否加急
	
	private String payType;//付费方式 到付/寄付

	
	
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	//@Id
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getSendername() {
		return sendername;
	}

	public void setSendername(String sendername) {
		this.sendername = sendername;
	}

	public String getSenderaddress() {
		return senderaddress;
	}

	public void setSenderaddress(String senderaddress) {
		this.senderaddress = senderaddress;
	}

	public String getSendertelenumber() {
		return sendertelenumber;
	}

	public void setSendertelenumber(String sendertelenumber) {
		this.sendertelenumber = sendertelenumber;
	}

	public String getReceivername() {
		return receivername;
	}

	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}

	public String getReceiveraddress() {
		return receiveraddress;
	}

	public void setReceiveraddress(String receiveraddress) {
		this.receiveraddress = receiveraddress;
	}

	public String getReceivertelenumber() {
		return receivertelenumber;
	}

	public void setReceivertelenumber(String receivertelenumber) {
		this.receivertelenumber = receivertelenumber;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPackprice() {
		return packprice;
	}

	public void setPackprice(Double packprice) {
		this.packprice = packprice;
	}

	public String getPkgtype() {
		return pkgtype;
	}

	public void setPkgtype(String pkgtype) {
		this.pkgtype = pkgtype;
	}

	public Date getDeparttime() {
		return departtime;
	}

	public void setDeparttime(Date departtime) {
		this.departtime = departtime;
	}

	public Date getArrivetime() {
		return arrivetime;
	}

	public void setArrivetime(Date arrivetime) {
		this.arrivetime = arrivetime;
	}

	public String getCheckstate() {
		return checkstate;
	}

	public void setCheckstate(String checkstate) {
		this.checkstate = checkstate;
	}

	public String getRealreceivertelenumber() {
		return realreceivertelenumber;
	}

	public void setRealreceivertelenumber(String realreceivertelenumber) {
		this.realreceivertelenumber = realreceivertelenumber;
	}

	public String getStuffId() {
		return stuffId;
	}

	public void setStuffId(String stuffId) {
		this.stuffId = stuffId;
	}

	public String getStus() {
		return stus;
	}

	public void setStus(String stus) {
		this.stus = stus;
	}

	public String getUrgent() {
		return urgent;
	}

	public void setUrgent(String urgent) {
		this.urgent = urgent;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Orderlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}