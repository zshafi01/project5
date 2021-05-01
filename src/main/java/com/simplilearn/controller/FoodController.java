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

import com.simplilearn.domain.Food;
import com.simplilearn.service.FoodService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@RequestMapping(path = "/listoffood")
	public List<Food> findfood() {
		List<Food> food = (List<Food>) foodService.findAll();
		
		return food;
	}

	@RequestMapping(path = "/addfood",method = RequestMethod.POST)
	public List<Food> save(@RequestBody Food food){
		
		return foodService.save(food);
		
	}
	
 
	@RequestMapping(path = "/food/{foodid}",method = RequestMethod.DELETE)
	public void deleteFood(@PathVariable("foodid") long foodid)   
	{  
	foodService.delete(foodid);  
	}  
	@RequestMapping(path = "/updatefoods",method = RequestMethod.PUT)

	public Food update(@RequestBody Food food)   
	{  
	foodService.update(food, food.getId()); 
	return food;  
	} 
	@GetMapping("/food/{foodid}")  
	public Optional<Food> getfoodbyid(@PathVariable("foodid") long foodid)   
	{  
	return foodService.getfoodById(foodid);  
	}  
	
	
}
