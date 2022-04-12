package com.api.book.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bookrestbook.entities.Book;
import com.api.book.bootrestbook.services.BookService;

@RestController
public class Controllerclass {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	
	public List<Book> getBooks()
	{
		return this.bookService.getAllBooks();
	    //Book book = new Book();
		//book.setId(12324);
		//book.setTitle("three mans in a boat");
		//book.setAuthor("james bond");
		//return book;
	}
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id")int id)
	{
		return bookService.getBookbyId(id);
	}
	
	

}
