package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity
//@Table(name="repertory")
public class Repertory {//厂库管理

	 	private String id; //编号

	    private String orderNumber; //订单编号

	    private Date timee; //入库时间

	    private String areanumber; //第n区

	    private String rownumber; //第n行

	    private String framenumber; //第n排

	    private String placenumber; //第n位

	    private String checkstate; //入库状态
	
	    private String rid;//入库管理id Repertoryin

	    
	   // @Id
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

		public String getAreanumber() {
			return areanumber;
		}

		public void setAreanumber(String areanumber) {
			this.areanumber = areanumber;
		}

		public String getRownumber() {
			return rownumber;
		}

		public void setRownumber(String rownumber) {
			this.rownumber = rownumber;
		}

		public String getFramenumber() {
			return framenumber;
		}

		public void setFramenumber(String framenumber) {
			this.framenumber = framenumber;
		}

		public String getPlacenumber() {
			return placenumber;
		}

		public void setPlacenumber(String placenumber) {
			this.placenumber = placenumber;
		}

		public String getCheckstate() {
			return checkstate;
		}

		public void setCheckstate(String checkstate) {
			this.checkstate = checkstate;
		}

		public String getRid() {
			return rid;
		}

		public void setRid(String rid) {
			this.rid = rid;
		}

		public Repertory() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
