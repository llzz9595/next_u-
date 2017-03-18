package com.nextu.service.demo;

import java.util.List;

import com.nextu.model.ClientsLives;
import com.nextu.service.IService;

/**
 *  测试service层
 * @author SYSTEM
 *
 */
public interface test_1 extends IService<ClientsLives>{
//	获取最热门直播前十
	String queryForPopularLives();	
	

}
