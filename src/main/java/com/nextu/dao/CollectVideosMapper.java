package com.nextu.dao;

import com.nextu.model.CollectVideos;
import com.nextu.util.MyMapper;

public interface CollectVideosMapper extends MyMapper<CollectVideos> {
	
	public int selectCollectVideoCountById(String id);

}