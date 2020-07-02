package com.jayden.web.controllers;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.jayden.web.domains.User;
import com.jayden.web.enums.Messenger;
import com.jayden.web.services.UserService;



@RestController
@RequestMapping("/user")
@SessionAttributes({"session"})
public class UserController {
	@Autowired UserService userService;
	
	 private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@PostMapping("/join")
	public Messenger join(@RequestBody User user) {
		System.out.println("넘어온 회원 정보 "+user.toString());
		return Messenger.SUCCESS; 
	}
	
	@PostMapping("/login/{userid}")
	public User login(HttpSession session, @RequestBody User user,@PathVariable String userid ) {
		User returnUser = userService.findByUseridAndPassword(user);
		 session.setAttribute("session", returnUser);
		return returnUser; 
	}
	
}
