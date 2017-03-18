package com.nextu.service.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextu.dao.ClientsLivesMapper;
import com.nextu.model.ClientsLives;
import com.nextu.service.impl.BaseService;
import com.nextu.util.OutputJson;

@Service("test_1")
public class Impl_test_1 extends BaseService <ClientsLives>
  implements test_1{
   
@Autowired
  private ClientsLivesMapper mapper ;
	
	@Override
	public String queryForPopularLives() {
	
//		调用dao层
		List list= mapper.queryForPopularLiveList();
//		转换json格式
		String result = OutputJson.TranslateToJson(list);
		// TODO Auto-generated method stub
		return result;
	}

}
