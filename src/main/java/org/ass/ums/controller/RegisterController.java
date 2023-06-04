package org.ass.ums.controller;

import org.ass.ums.dto.RegisterDto;
import org.ass.ums.entity.RegisterEntity;
import org.ass.ums.service.impl.RegisterServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@Autowired
	private RegisterServicesImp registerServiceImpl;
	
	@RequestMapping(value = "/saveUserDetails")
	public ModelAndView saveUserDetails(RegisterEntity registerEntity) {
		System.out.println(registerEntity);
		registerServiceImpl.processUserInfo(registerEntity);
		return new ModelAndView("index.jsp");
		
	}

}
