package com.serivires.twiris.common.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.serivires.twiris.common.model.User;

@Repository
public class UsersDAO {
	@Autowired
	SqlSessionTemplate sessionTemplate;
	
	private static final String NAME_SPACE = "users.";
	
	public List<User> selectUsers() {
		return sessionTemplate.selectList(NAME_SPACE + "selectUsers");
	}
}
