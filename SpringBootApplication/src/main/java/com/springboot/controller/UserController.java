package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.UserEntity;
import com.springboot.service.UserService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/user")
@Api(tags = {"User API"})
public class UserController {

	@Autowired
	private UserService userService;

	@Value("${databse.service : value}")
	private String databseUri;
	
	
	@GetMapping("/getAllUsers")
	public List<UserEntity> getAllUser() {
		System.out.println("databse UR: "+databseUri);
		System.out.println("get All User Controller");
		return userService.getAllUsers();
	}

	@PostMapping("/createUser")
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity entity) {
		UserEntity uEntity = userService.saveUser(entity);
		return ResponseEntity.status(200).body(uEntity);
	}
	
	@GetMapping("/getUser/{userLogin}")
	public List<UserEntity> getUser(@PathVariable("userLogin") String  userLogin ) {
		System.out.println("get User By ID");
		return userService.getUserByUserName(userLogin);
	}


}
