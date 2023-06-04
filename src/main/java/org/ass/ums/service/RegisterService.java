package org.ass.ums.service;

import java.util.List;

import org.ass.ums.entity.RegisterEntity;

public interface RegisterService {
	
	public void processUserInfo(RegisterEntity registerEntity);
	public List<RegisterEntity> getAllUser();

}
