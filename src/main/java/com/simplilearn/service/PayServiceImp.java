package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.domain.Pay;
import com.simplilearn.reposetory.PayRepository;

@Service
public class PayServiceImp implements PayService{

	@Autowired
	private PayRepository payRepository;
	
	@Override
	public List<Pay> payList() {
		return (List<Pay>) payRepository.findAll();
	}

	@Override
	public List<Pay> save(Pay pay) {
		payRepository.save(pay);
		return payList();
	}

	@Override
	public void updatePay(Pay pay, long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePay(long id) {
		payRepository.deleteById(id);		
	}

	@Override
	public Optional<Pay> getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
