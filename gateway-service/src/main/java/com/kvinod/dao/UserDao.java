package com.kvinod.dao;

import org.springframework.data.repository.CrudRepository;

import com.kvinod.entity.User;

public interface UserDao extends CrudRepository<User, Integer>{
	public User findByUsername(String username);
}
