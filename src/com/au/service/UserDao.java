package com.au.service;

import java.util.List;

import com.au.model.User;
public interface UserDao {
	User findById(int id);

	void saveUser(User user);
	void updateUser(User user);
	
	void deleteUser(int UserId);
	
	List<User> findAllUsers();

	User findUserByUsername(String UserName);
}
