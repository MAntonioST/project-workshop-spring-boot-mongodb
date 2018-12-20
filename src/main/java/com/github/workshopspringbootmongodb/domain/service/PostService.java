package com.github.workshopspringbootmongodb.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.workshopspringbootmongodb.domain.Post;
import com.github.workshopspringbootmongodb.domain.repository.PostRepository;
import com.github.workshopspringbootmongodb.domain.service.exception.ObjectNotFoundException;



@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	
	
}