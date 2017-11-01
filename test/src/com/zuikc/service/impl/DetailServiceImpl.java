package com.zuikc.service.impl;

import java.util.List;

import com.zuikc.dao.DetailDao;
import com.zuikc.dao.UserInfoDao;
import com.zuikc.entity.Detail;
import com.zuikc.entity.Page;
import com.zuikc.entity.UserInfo;
import com.zuikc.service.DetailService;
import com.zuikc.service.UserInfoService;

public class DetailServiceImpl implements DetailService {
	private DetailDao detaildao;
	
	public DetailServiceImpl(DetailDao detaildao) {
		super();
		this.detaildao = detaildao;
	}

	@Override
	public void saveUser(Detail detail) {
		// TODO Auto-generated method stub
		detaildao.saveUser(detail);
	}

	@Override
	public List<Detail> queryUserByPage(Page page) {
		// TODO Auto-generated method stub
		return detaildao.queryUserByPage(page);
	}

	

}
