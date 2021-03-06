package com.springmvc.example.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.example.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findUserByEmailAndPassword(String email, String password);
	
}
