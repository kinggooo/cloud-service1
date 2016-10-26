package com.wangnz.cloud.simple.service.domain;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangnz.cloud.simple.service.dao.UserDao;
import com.wangnz.cloud.simple.service.model.User;



@Service
//@Transactional
public class UserService {

	
	//@Autowired
	private UserDao userMapper;
	
	public List<User> searchAll(){
		//List<User> list = userMapper.findAll();
		return null;
	}
}
