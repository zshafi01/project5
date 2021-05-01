package com.simplilearn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.domain.Food;
import com.simplilearn.reposetory.ezfoodRepository;

@Service
public class FoodServiceImp implements FoodService {
	
	@Autowired
	private ezfoodRepository ezfoodRepository;

	@Override
	public List<Food> findAll() {
		return (List<Food>) ezfoodRepository.findAll();
	}

	@Override
	public List<Food> save(Food food) {
		ezfoodRepository.save(food);
		return findAll();
	}

	@Override
	public void delete(long id) {
		ezfoodRepository.deleteById(id);
	}

	@Override
	public void update(Food food, long foodid) {
			ezfoodRepository.save(food);
	}

	@Override
	public Optional<Food> getfoodById(long id) {
		return ezfoodRepository.findById(id);
		
	}

	
}

// }
