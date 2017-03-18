package com.nextu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nextu.model.Search;
import com.nextu.model.sectionshare.search.SearchResult;
import com.nextu.util.MyMapper;

public interface SearchMapper extends MyMapper<Search>{
	public String[] queryPopularSearch();

	public List<SearchResult> selectResultByKey(@Param("type")String type,
			@Param("theme")String theme);

}
