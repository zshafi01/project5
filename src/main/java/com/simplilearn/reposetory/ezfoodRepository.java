package com.simplilearn.reposetory;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.domain.Food;

public interface ezfoodRepository extends CrudRepository<Food, Long> {

}
