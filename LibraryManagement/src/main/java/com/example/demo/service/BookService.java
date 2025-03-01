package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

public class BookService {

	@Autowired
	BookRepository br ;
	
	public String saveBook(Book b) {
		
		
		br.save(b);
		return "success";
		
	}
	
	
}
