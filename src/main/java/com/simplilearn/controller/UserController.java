package com.simplilearn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.domain.User;
import com.simplilearn.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(path = "/listofuser")
	public List<User> finduser() {
		List<User> user = (List<User>) userService.userList();
		
		return user;
	}

	@RequestMapping(path = "/adduser",method = RequestMethod.POST)
	public List<User> save(@RequestBody User user){
		
		return userService.save(user);
		
	}
	
 
	@RequestMapping(path = "/user/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") long id)   
	{  
	userService.deleteuser(id);  
	}  
	@RequestMapping(path = "/updateuser",method = RequestMethod.PUT)

	public User update(@RequestBody User user, long id)   
	{  
	userService.updateuser(user, id); 
	return user;  
	} 
	@GetMapping("/user/{id}")  
	public Optional<User> getuserById(@PathVariable("id") long id)   
	{  
	return  userService.getById(id); 
	}  
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(@RequestBody User user){
		
		 String verifyUser = userService.verifyUser(user);
		 return verifyUser;
		
	}


}
