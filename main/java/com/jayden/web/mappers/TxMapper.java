package com.jayden.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.jayden.web.domains.User;

@Repository
public interface TxMapper {
	@Insert("insert into users (userid, password) "
			+ " values #{userid}, #{password}")
	public void insertUser(User user);

}