package com.nextu.dao;

import com.nextu.model.Clients;
import com.nextu.model.userbaseinfo.UserBaseInfoModel;
import com.nextu.util.MyMapper;

public interface ClientsMapper extends MyMapper<Clients> {
	public UserBaseInfoModel selectBaseInfoById (String id);
}