package com.ventura013.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ventura013.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
