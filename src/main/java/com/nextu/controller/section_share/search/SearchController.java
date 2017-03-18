package com.nextu.controller.section_share.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nextu.dao.SearchMapper;
import com.nextu.model.sectionshare.search.SearchResult;
import com.nextu.util.OutputJson;

@Controller
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private SearchMapper mapper;
	
	@RequestMapping("/popular")
	public ModelAndView getSearchPopular()

	{
		ModelAndView mav = new ModelAndView("/loginResult");
	    String []s = mapper.queryPopularSearch();
	    String result = OutputJson.TranslateToJson(s);
	    mav.addObject("result",result);
	    
		return mav;
	}
/*
 * 通过输入字符进行三表搜索
 */
	
	@RequestMapping("/result")
	public ModelAndView getSearchResult(@RequestParam (value ="type", required = false)
	String key)
	{
		ModelAndView mav = new ModelAndView("/loginResult");
//		获取数据库查询结果
	    List<SearchResult> list = mapper.selectResultByKey(key,key);
//	    转换json
	    String result = OutputJson.TranslateToJson(list);
	    mav.addObject("result",result);
	    
		return mav;
	}
}
