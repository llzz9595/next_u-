package com.nextu.dao;

import java.util.List;

import com.nextu.model.Videos;
import com.nextu.model.sectionshare.videoroom.SelfChannelModel;
import com.nextu.util.MyMapper;

public interface VideosMapper extends MyMapper<Videos> {
	public List<SelfChannelModel> queryForPopularVideoList(String type);
}