package com.zuikc.service;

import java.util.List;

import com.zuikc.entity.Detail;
import com.zuikc.entity.Page;
import com.zuikc.entity.UserInfo;

public interface DetailService {
	public void saveUser(Detail detail);
	public List<Detail> queryUserByPage(Page page);
}
