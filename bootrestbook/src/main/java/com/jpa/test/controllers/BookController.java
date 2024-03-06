package com.jpa.test.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.entities.Book;

@RestController
public class BookController {
	
	@GetMapping("/books")
	public Book getBooks()
	{
		System.out.println("Inside Controller");
		Book book=new Book();
		book.setAuthor("Siddharth");
		book.setId(1);
		book.setTitle("Springboot");
		return book;
	}

}
