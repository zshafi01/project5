package com.simplilearn.reposetory;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.domain.Pay;

public interface PayRepository extends CrudRepository<Pay, Long> {

}
