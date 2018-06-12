package com.xyqhit.logistics.pojo;

public class User { //用户管理

    private String userId; //账号
    
    private String userName; //姓名

    private String pass; //密码

    private String idtype; //职位
    
    private String agencyId; //机构编号 --> Agency

	private String id;//员工编号

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
    
}