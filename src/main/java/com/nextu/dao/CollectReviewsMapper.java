package com.nextu.dao;

import com.nextu.model.CollectReviews;
import com.nextu.util.MyMapper;

public interface CollectReviewsMapper extends MyMapper<CollectReviews> {

	public int selectCollectReviewCountById(String id);
}