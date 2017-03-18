package com.nextu.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nextu.dao.RegistersMapper;
import com.nextu.model.Registers;

@Controller
public class LoginController {

	@Autowired
	private RegistersMapper mapper;
	
	@RequestMapping("/login")
	public ModelAndView doLogin(@RequestParam (value ="username", required = false)
	String username,@RequestParam (value ="password" ,required=false) String password)
	{
		ModelAndView mav = new ModelAndView("/loginResult");
		Registers model = new Registers();
		model = mapper.selectById(username);
		String result ;
		if(model != null && model.getPassword().equals(password))
		   result = "success";
		else
			result = "fail";
		mav.addObject("result", result);
		return mav;
	}
			
              
}
	

