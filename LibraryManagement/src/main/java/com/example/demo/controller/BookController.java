package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;


@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookRepository br ;
	
	@GetMapping("/health")
	public String getHealth() {
		return "Service is up and running";
	}

	@GetMapping(value="/book",produces="application/json")
	public Book getBook() {
		
		Book book = new Book(1234,"Eat that frog","Brian Tracy",10,200.30f,"Babu");
		return book;
	}
	
	@PostMapping("/save")
	public String saveBook(@RequestBody Book b) {
		
		System.out.println(b.getTitle());
		System.out.println(b.getComments());
		br.save(b);
		return "book saved successfully"; 
	}
	
	@GetMapping("/allbooks")
	public List<Book>getAllbooks(){
		
		return br.findAll();
	}
	
	
}
