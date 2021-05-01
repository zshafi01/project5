package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import com.simplilearn.domain.Pay;

public interface PayService {
	
	List<Pay> payList();
	List<Pay>save(Pay pay);
	void updatePay(Pay pay, long id);
	void deletePay(long id);
	public Optional<Pay> getById(long id);
}
