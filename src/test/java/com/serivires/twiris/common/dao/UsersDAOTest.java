package com.serivires.twiris.common.dao;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.serivires.twiris.common.model.User;


@TransactionConfiguration(defaultRollback = true)
@ContextConfiguration({ "classpath:spring/root-context.xml" })
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class UsersDAOTest {
	@Autowired
	UsersDAO usersDAO;
	
	@Test
	public void 모든_유저_정보를_불러옵니다() {
		// given
		
		// when
		List<User> result = usersDAO.selectUsers();
		
		// then
		System.out.println(result.toString());
	}
}
