package com.nextu.controller.userinfopage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nextu.dao.ClientsConcernMapper;
import com.nextu.dao.ClientsLivesMapper;
import com.nextu.dao.ClientsMapper;
import com.nextu.dao.CollectReviewsMapper;
import com.nextu.dao.CollectVideosMapper;
import com.nextu.dao.RegistersMapper;
import com.nextu.dao.UploadVideosMapper;
import com.nextu.model.userbaseinfo.UserBaseInfoModel;
import com.nextu.util.OutputJson;


@Controller
@RequestMapping("/user")
public class InitUserInfoDataController {

	@Autowired
	private ClientsMapper clientsMapper;
	
	@Autowired
	private ClientsConcernMapper clientsConcernMapper;
	
	@Autowired
	private ClientsLivesMapper clientsLivesMapper;
	
	@Autowired
	private CollectReviewsMapper collectReviewsMapper;
	
	@Autowired
	private CollectVideosMapper collectVideosMapper;
	
	@Autowired
	private UploadVideosMapper uploadVideosMapper;
	
	@Autowired
	private RegistersMapper registersMapper;
	
	/**
	 * 获取用户基本信息
	 * 
	 */
	@RequestMapping("/base")
	public ModelAndView getUserBaseInfo( @RequestParam (value ="id",required = false
)String id)
	{
	   ModelAndView mav = new ModelAndView("loginResult");
	   UserBaseInfoModel model = new UserBaseInfoModel();
//	　进行数据库查询
	   model = clientsMapper.selectBaseInfoById(id);
	   int concernCount = clientsConcernMapper.selectConcernCountById(id);
	   int fansCount = clientsConcernMapper.selectFansCountById(id);
	   int livesCount = clientsLivesMapper.selectLiveCountById(id);
	   int collectReviewCount = collectReviewsMapper.selectCollectReviewCountById(id);
	   int collectVideoCount = collectVideosMapper.selectCollectVideoCountById(id);
	   int collectCount = collectReviewCount + collectVideoCount;
	   int uploadCount = uploadVideosMapper.selectUploadVideoCountById(id);
	   String gender = registersMapper.selectSexById(id);
//	   封装数据城model
	   model.setUserSex(gender);
	   if(model.getUserRank() > 0)
	   model.setUserLevel(model.getUserRank()/model.getUserRankPeople());
	   else
		   model.setUserLevel(0);
	   model.setUserNum_Focus(concernCount);
	   model.setUserNum_Fans(fansCount);
	   model.setUserNum_Collection(collectCount);
	   model.setUserNum_Live(livesCount);
	   model.setUserNum_SelfChannel(uploadCount);
//	   Json 数据转换
	   String result = OutputJson.TranslateToJson(model);
		mav.addObject("result",result);


	   return mav;
	}
}
