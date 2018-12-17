package com.github.workshopspringbootmongodb.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.workshopspringbootmongodb.domain.User;
import com.github.workshopspringbootmongodb.domain.repository.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}