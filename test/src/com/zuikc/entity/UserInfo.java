package com.zuikc.entity;



public class UserInfo {
	private Integer userId; // 用户ID
	private String userName;// 用户名
	private String pwd;
	private String dept;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(String userName, String pwd, String dept) {
		super();
		this.userName = userName;
		this.pwd = pwd;
		this.dept = dept;
	}

	public UserInfo(Integer userId, String userName, String pwd, String dept) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.pwd = pwd;
		this.dept = dept;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", pwd=" + pwd + ", dept=" + dept + "]";
	}
	
}
