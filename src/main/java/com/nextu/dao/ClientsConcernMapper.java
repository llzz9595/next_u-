package com.nextu.dao;

import com.nextu.model.ClientsConcern;
import com.nextu.util.MyMapper;

public interface ClientsConcernMapper extends MyMapper<ClientsConcern> {
  
	public int selectFansCountById(String id);
	public int selectConcernCountById(String id);
	
}