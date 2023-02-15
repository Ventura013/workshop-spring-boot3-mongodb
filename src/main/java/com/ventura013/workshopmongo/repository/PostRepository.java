package com.ventura013.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ventura013.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
