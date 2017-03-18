package com.nextu.controller.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nextu.model.sectionshare.liveroom.impl_LiveRoom_Model;
import com.nextu.service.demo.test_1;
import com.nextu.util.OutputJson;

@Controller
@RequestMapping("/testService")
public class Controller_Test_1 {
	
	@Autowired
	private test_1 service;
	
	@RequestMapping("/popular")
	public ModelAndView  getPopularLiveList()
	{

		ModelAndView mav = new ModelAndView("loginResult");
//	 调用service 层
		String result = service.queryForPopularLives();
//		输出
		mav.addObject("result",result);
		return mav;
	}
	

}
