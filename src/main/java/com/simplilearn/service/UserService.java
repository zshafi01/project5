package com.simplilearn.service;

import  com.simplilearn.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

	List<User> userList();
	List<User>save(User admin);
	void updateuser(User admin, long id);
	void deleteuser(long id);
	public Optional<User> getById(long id);
	String verifyUser(User user);
	
}
