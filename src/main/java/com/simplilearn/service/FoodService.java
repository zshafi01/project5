package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import com.simplilearn.domain.Food;

public interface FoodService {
	
	List<Food> findAll();
	List<Food> save(Food food);
	void delete(long id);
	void update(Food food, long foodid);
	public Optional<Food> getfoodById(long id);

}
