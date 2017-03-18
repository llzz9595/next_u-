package com.nextu.dao;

import com.nextu.model.Comments;
import com.nextu.util.MyMapper;

public interface CommentsMapper extends MyMapper<Comments> {
	public int selectCommentsCountById(String id);
}