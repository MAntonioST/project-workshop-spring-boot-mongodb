package com.github.workshopspringbootmongodb.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.github.workshopspringbootmongodb.domain.User;



@Repository
public interface UserRepository extends MongoRepository<User, String> {

}