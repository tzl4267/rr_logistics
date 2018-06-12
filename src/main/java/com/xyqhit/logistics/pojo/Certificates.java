package com.xyqhit.logistics.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="certificates")
public class Certificates { //证件管理


		private String cid;//
		
		private String cNumber;//证件编号
		
		
		private Date time;//年审时间
		
		
		private Date overTime;//过期时间
		
		
		private String did;//证件类型编号 DocumentType

		//@Id
		public String getCid() {
			return cid;
		}


		public void setCid(String cid) {
			this.cid = cid;
		}


		public String getcNumber() {
			return cNumber;
		}


		public void setcNumber(String cNumber) {
			this.cNumber = cNumber;
		}


		public Date getTime() {
			return time;
		}


		public void setTime(Date time) {
			this.time = time;
		}


		public Date getOverTime() {
			return overTime;
		}


		public void setOverTime(Date overTime) {
			this.overTime = overTime;
		}


		public String getDid() {
			return did;
		}


		public void setDid(String did) {
			this.did = did;
		}


		public Certificates() {
			super();
			// TODO Auto-generated constructor stub
		}






}