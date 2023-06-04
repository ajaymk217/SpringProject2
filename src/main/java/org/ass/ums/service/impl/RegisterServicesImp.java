package org.ass.ums.service.impl;

import java.util.List;

import org.ass.ums.entity.RegisterEntity;
import org.ass.ums.repository.RegisterRepositroy;
import org.ass.ums.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service

public class RegisterServicesImp implements  RegisterService {
	
	@Autowired
	private RegisterRepositroy registerRepository;
	
	@Override
	public void processUserInfo(RegisterEntity registerEntity) {
		
		registerRepository.saveUser(registerEntity);
	}


	@Override
	public @ResponseBody List<RegisterEntity> getAllUser() {
		return registerRepository.findAllUsers();
	}
	
	
	

}
