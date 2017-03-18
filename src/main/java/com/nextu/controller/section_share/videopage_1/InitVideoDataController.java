package com.nextu.controller.section_share.videopage_1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nextu.dao.VideosMapper;
import com.nextu.model.sectionshare.videoroom.SelfChannelModel;
import com.nextu.util.Bag;
import com.nextu.util.OutputJson;

/**
 * 获取各分类热门视频
 * @return
 */

@Controller
@RequestMapping("/selfchannel")
public class InitVideoDataController {

	
	@Autowired
	private VideosMapper mapper;
	
	
	@RequestMapping("/popular")
	public ModelAndView getPopulerSelfChannelBag()
	{
        ModelAndView mav = new ModelAndView("loginResult");
//      利用bags 装数据   
        Bag<SelfChannelModel>[] bags = new Bag[8];
        for(int i = 0; i< 8; i++)
           bags[i] = new Bag<SelfChannelModel>();
//   数据库查询     
        List<SelfChannelModel> list =
        		mapper.queryForPopularVideoList("大学课程");
        
        for(SelfChannelModel model : list)
        {
//        	System.out.println("----"+model.getSelfChannel_Date());
        	bags[0].add(model);
            bags[2].add(model);
            bags[4].add(model);
            bags[6].add(model);
        }
        
        List<SelfChannelModel> list_1 =
        		mapper.queryForPopularVideoList("求职");
        for(SelfChannelModel model : list_1)
        {
//        	部分需替代----
        	bags[1].add(model);
        	  bags[3].add(model);
        	  bags[5].add(model);
        	  bags[7].add(model);
        	          }
        // 其他
//       转换字符串
        String result = OutputJson.TranslateToJson(bags);
		mav.addObject("result",result);

        return mav;
	}
	
	
}
