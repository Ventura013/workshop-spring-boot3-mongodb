package com.ventura013.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventura013.workshopmongo.domain.Post;
import com.ventura013.workshopmongo.repository.PostRepository;
import com.ventura013.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	public PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("object not found"));
		}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
