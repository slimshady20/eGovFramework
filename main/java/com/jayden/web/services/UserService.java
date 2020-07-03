package com.jayden.web.services;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jayden.web.domains.User;

@Component
public interface UserService {
	public void save();
	 public void update();
	 public void findOne();
	 public List<User> findAll();	
	 public void count();
	 public void delete();
	 public User findByUseridAndPassword(User user);
	 public void findByEmailOrUserId(String email, String userId);
	 public void findByCreatedAtBetween(Date fromDate, Date toDate);
	 public void findByAgeGraterThanEqual(int age);
	 public void findByNameLike(String name);
	 public void findByJobIsNull();
	 public void findByJob(String jobs);
	 public void findByEmailOrderByNameAsc(String email);
		
}
