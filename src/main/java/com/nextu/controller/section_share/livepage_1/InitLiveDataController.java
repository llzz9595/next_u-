package com.nextu.controller.section_share.livepage_1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nextu.dao.ClientsLivesMapper;
import com.nextu.model.sectionshare.liveroom.impl_LiveRoom_Model;
import com.nextu.util.OutputJson;

@Controller
@RequestMapping("/live")
public class InitLiveDataController {
	
	@Autowired
	private ClientsLivesMapper mapper;
	private String n;
	/**
	 * 查询热门直播
	 * @return
	 */
	@RequestMapping("/popular")
	public ModelAndView  getPopularLiveList()
	{

		ModelAndView mav = new ModelAndView("loginResult");
//	数据库获取数据
		List<impl_LiveRoom_Model> list 
		= mapper.queryForPopularLiveList();
//转换json格式
		 String result = OutputJson.TranslateToJson(list);
		
		mav.addObject("result",result);
		return mav;
	}
	

}
