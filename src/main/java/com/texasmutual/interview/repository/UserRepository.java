package com.texasmutual.interview.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.texasmutual.interview.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	public List<User> findAll();
}