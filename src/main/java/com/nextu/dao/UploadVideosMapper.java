package com.nextu.dao;

import com.nextu.model.UploadVideos;
import com.nextu.util.MyMapper;

public interface UploadVideosMapper extends MyMapper<UploadVideos> {
	public int selectUploadVideoCountById(String id);
}