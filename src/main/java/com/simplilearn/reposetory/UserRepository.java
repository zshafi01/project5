package com.simplilearn.reposetory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.simplilearn.domain.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	List<User> getByemail(String email);
	

}
