package com.nextu.dao;

import java.util.List;

import com.nextu.model.Reviews;
import com.nextu.model.sectionshare.reviewroom.Impl_ReviewRoom_Model;
import com.nextu.util.MyMapper;

public interface ReviewsMapper extends MyMapper<Reviews> {
	public List<Impl_ReviewRoom_Model> queryForPopularReviewList();
	public List<Impl_ReviewRoom_Model> queryForLastestReviewList();
}