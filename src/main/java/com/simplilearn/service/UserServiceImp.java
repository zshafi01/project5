package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.domain.User;
import com.simplilearn.reposetory.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> userList() {
		return  (List<User>) userRepository.findAll();
	}

	@Override
	public List<User> save(User user) {
		userRepository.save(user);
		return userList();
	}

	@Override
	public void updateuser(User user, long id) {

		userRepository.save(user);
	}

	@Override
	public void deleteuser(long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public Optional<User> getById(long id) {
		return userRepository.findById(id);
	}
	
	public List<User> getByEmail(String email){
		
		return  userRepository.getByemail(email);
	}

	@Override
	public String verifyUser(User user) {
		List<User> users = getByEmail(user.getEmail());
		User userfound = users.get(0);
		if (userfound!=null && userfound.getPassword().equals(user.getPassword())) {
			return userfound.getRole();
		}else {
			return null;
		}
		
	}

}
