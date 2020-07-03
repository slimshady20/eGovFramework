package com.jayden.web.services;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayden.web.domains.User;
import com.jayden.web.mappers.UserMapper;
@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired UserMapper userMapper;
	@Autowired User user;
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update() {
		// TODO Auto-generateds method stub
		
	}
	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByEmailOrUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByJobIsNull() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByJob(String jobs) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User findByUseridAndPassword(User param) {
		return userMapper.selectByUseridAndPassword(param);
		
	}
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}



	

}
