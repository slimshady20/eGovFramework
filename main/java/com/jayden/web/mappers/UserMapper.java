package com.jayden.web.mappers;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.jayden.web.domains.User;

@Repository
public interface UserMapper {
	public void insertUser(User user);
	public User selectByUseridAndPassword(User user);
	public List<User> selectAll();
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUser(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncateUser(HashMap<String, String> paramMap);
}
