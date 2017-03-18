package com.nextu.dao;



import java.util.List;

import com.nextu.model.ClientsLives;
import com.nextu.model.sectionshare.liveroom.impl_LiveRoom_Model;
import com.nextu.util.MyMapper;

public interface ClientsLivesMapper extends MyMapper<ClientsLives> {

	public List<impl_LiveRoom_Model> queryForPopularLiveList();
	public int selectLiveCountById(String id);

}