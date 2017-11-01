package com.zuikc.dao;

import java.util.List;

import com.zuikc.entity.Page;
import com.zuikc.entity.UserInfo;



public interface UserInfoDao {
	public UserInfo userLogin(UserInfo userInfo);
	public void saveUser(UserInfo userInfo);
	public List<UserInfo> queryUserByPage(Page page);
	public void deleteUser(int userid);
	public int queryRows();
	
}
