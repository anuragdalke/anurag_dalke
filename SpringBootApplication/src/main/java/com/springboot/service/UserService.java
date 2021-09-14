package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.UserEntity;
import com.springboot.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserEntity> getAllUsers() {
		System.out.println("getAllUsers");
		List<UserEntity> userList = new ArrayList<>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}

	public UserEntity saveUser(UserEntity userEntity) {
		System.out.println("saveUser.");
		return userRepository.save(userEntity);

	}

	public List<UserEntity> getUserByUserName(String  id) {
		System.out.println("getUserById");
		List<UserEntity> userList = new ArrayList<>();
		userRepository.findByUserLoginContaining(id).stream().forEach(userList::add);
		return userList;
	}

}
