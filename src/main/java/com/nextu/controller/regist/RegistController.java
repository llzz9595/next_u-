package com.nextu.controller.regist;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nextu.dao.RegistersMapper;
import com.nextu.model.Registers;

@Controller
public class RegistController {

	@Autowired 
	private RegistersMapper mapper;
	
	@RequestMapping("/regist")
	public ModelAndView  doRegist(@RequestParam (value ="clientId", required = false)
	String clientId,@RequestParam (value ="clientPassword",
	required = false)
	String clientPassword,@RequestParam (value ="clientName", required = false)
	String clientName,@RequestParam (value ="registerDate", required = false)
	String registerDate)
	{
		ModelAndView mav = new ModelAndView("loginResult");
	    Registers model = new Registers();
	    model.setName(clientName);
        model.setSex("男");
        model.setPassword(clientPassword);
        model.setClientId(clientId);
        model.setRegisterDate(new Date());
        mapper.insert(model);
	    return mav;
	}
}
