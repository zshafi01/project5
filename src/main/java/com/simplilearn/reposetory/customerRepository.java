package com.simplilearn.reposetory;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.domain.Customer;

public interface customerRepository extends CrudRepository<Customer, Long> {

}
