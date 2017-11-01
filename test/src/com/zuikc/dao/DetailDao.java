package com.zuikc.dao;

import java.util.List;

import com.zuikc.entity.Detail;
import com.zuikc.entity.Page;
import com.zuikc.entity.UserInfo;

public interface DetailDao {
	public void saveUser(Detail detail);
	public List<Detail> queryUserByPage(Page page);
	List<Detail> queryUserByDept(String dept);
}
