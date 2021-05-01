package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.domain.Pay;
import com.simplilearn.service.PayService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PayController {

	@Autowired
	private PayService payservice;
	@RequestMapping(path = "/addpay",method = RequestMethod.POST)
	public List<Pay> save(@RequestBody Pay pay){
		
		return payservice.save(pay);
		
	}
}
