package com.au.service;

import java.util.List;

import com.au.model.User;
public interface UserDao {
	User findById(int id);

	void saveUser(User User);
	
	void deleteUserByUsername(String UserName);
	
	List<User> findAllUsers();

	User findUserByUsername(String UserName);
}
