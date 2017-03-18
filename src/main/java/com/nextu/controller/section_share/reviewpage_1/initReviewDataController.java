package com.nextu.controller.section_share.reviewpage_1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nextu.dao.CommentsMapper;
import com.nextu.dao.ReviewsMapper;
import com.nextu.model.sectionshare.reviewroom.Impl_ReviewRoom_Model;
import com.nextu.util.OutputJson;

@Controller
@RequestMapping("/review")
public class initReviewDataController {

	@Autowired
	private ReviewsMapper reviewMapper;
	
	@Autowired
	private CommentsMapper commentsMapper;
	
	/*
	 * 获取往期回顾热门回顾
	 */
	@RequestMapping("/popular")
	public ModelAndView getPopularReviewList()
	{
		ModelAndView mav = new ModelAndView("loginResult");
//		查询数据库
		List<Impl_ReviewRoom_Model> list = reviewMapper.queryForPopularReviewList();
		for(Impl_ReviewRoom_Model model : list)
		{
			model.setReviewRoom_Comments
			(""+commentsMapper.selectCommentsCountById
					(model.getReviewRoom_id()));
		}
//		Json 字符处理
			String result = OutputJson.TranslateToJson(list);
			
			mav.addObject("result",result);

		return mav;
	}
	
	/*
	 * 获取往期回顾最新视频
	 */
	@RequestMapping("/lastest")
	public ModelAndView getLastestReviewList()
	{
//		
		ModelAndView mav = new ModelAndView("loginResult");
//		查询数据库
		List<Impl_ReviewRoom_Model> 
		list = reviewMapper.queryForLastestReviewList();
		for(Impl_ReviewRoom_Model model : list)
		{
			model.setReviewRoom_Comments
			(""+commentsMapper.selectCommentsCountById(model.getReviewRoom_id()));
		}
//		 json 转换
			String result = OutputJson.TranslateToJson(list);
			mav.addObject("result",result);

		return mav;
	}
}
