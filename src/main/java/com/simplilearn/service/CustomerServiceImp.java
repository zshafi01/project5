package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.domain.Customer;
import com.simplilearn.reposetory.customerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private customerRepository customerRepository;
	
	@Override
	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public List<Customer> save(Customer customer) {
		customerRepository.save(customer);
		return findAll();
	}

	@Override
	public void updatecustomer(Customer customer, long id) {
		customerRepository.save(customer);
		
	}

	

	@Override
	public Optional<Customer> getById(long id) {
		return customerRepository.findById(id);
	}

	@Override
	public void deletecustomer(long id) {
		customerRepository.deleteById(id);
		
	}




}
