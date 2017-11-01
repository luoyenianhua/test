package com.zuikc.entity;

public class Detail {
	private Integer userId;
	private String userName;
	private String dept;
	private String goTime;
	private String reason;
	private String destination;
	private String backTime;
	private String tel;
	public Detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detail(Integer userId, String userName, String dept, String goTime, String reason, String destination,
			String backTime, String tel) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.dept = dept;
		this.goTime = goTime;
		this.reason = reason;
		this.destination = destination;
		this.backTime = backTime;
		this.tel = tel;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGoTime() {
		return goTime;
	}
	public void setGoTime(String goTime) {
		this.goTime = goTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getBackTime() {
		return backTime;
	}
	public void setBackTime(String backTime) {
		this.backTime = backTime;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Detail [userId=" + userId + ", userName=" + userName + ", dept=" + dept + ", goTime=" + goTime
				+ ", reason=" + reason + ", destination=" + destination + ", backTime=" + backTime + ", tel=" + tel
				+ "]";
	}
	
}
