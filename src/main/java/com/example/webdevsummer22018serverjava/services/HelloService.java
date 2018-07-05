package com.example.webdevsummer22018serverjava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdevsummer22018serverjava.models.Hello;
import com.example.webdevsummer22018serverjava.repositories.HelloRepository;

@RestController
public class HelloService {
	@Autowired
	HelloRepository repository;	
	
	@GetMapping("/api/hello")
	public Iterable<Hello> findallHellos(){
		return repository.findAll();
	}

}
