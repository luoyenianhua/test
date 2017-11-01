package com.zuikc.service.impl;

import java.util.List;

import com.zuikc.dao.UserInfoDao;
import com.zuikc.entity.Page;
import com.zuikc.entity.UserInfo;
import com.zuikc.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService {
	private UserInfoDao userinfodao;
	
	public UserInfoServiceImpl(UserInfoDao userinfodao) {
		super();
		this.userinfodao = userinfodao;
	}

	@Override
	public UserInfo userLogin(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userinfodao.userLogin(userInfo);
	}

	@Override
	public void saveUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		userinfodao.saveUser(userInfo);
	}

	@Override
	public List<UserInfo> queryUserByPage(Page page) {
		// TODO Auto-generated method stub
		return userinfodao.queryUserByPage(page);
	}

	@Override
	public void deleteUser(int userid) {
		// TODO Auto-generated method stub
		userinfodao.deleteUser(userid);
	}

	@Override
	public int queryRows() {
		// TODO Auto-generated method stub
		return userinfodao.queryRows();
	}

}
