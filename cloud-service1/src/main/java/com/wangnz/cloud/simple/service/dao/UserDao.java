package com.wangnz.cloud.simple.service.dao;

import java.util.List;

import com.wangnz.cloud.simple.service.model.User;


public interface UserDao {

	List<User> findAll();
}
