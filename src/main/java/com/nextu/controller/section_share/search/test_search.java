package com.nextu.controller.section_share.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nextu.dao.SearchMapper;
import com.nextu.util.OutputJson;

@Controller
@RequestMapping("/search")
public class test_search {
	@Autowired
	SearchMapper mapper;
	@RequestMapping("/list")
	public ModelAndView testSearch()
	{
		ModelAndView mav = new ModelAndView("loginResult");
//		ObjectMapper objextMapper = new ObjectMapper();
		List list = mapper.selectAll();

		String[] s = mapper.queryPopularSearch();
		String result=OutputJson.TranslateToJson(list);
//		try {
//			result = objextMapper.writeValueAsString(s);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		mav.addObject("result",result);

		return mav;
		
	}

	
}
