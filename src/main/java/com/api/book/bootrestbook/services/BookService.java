package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bookrestbook.entities.Book;
@Component
public class BookService {
	private static List<Book> list= new ArrayList<>();
	static {
		list.add(new Book(12,"java complete reference","xyz"));
		list.add(new Book(13,"head first to java","abc"));
		list.add(new Book(14,"things of java","pqr"));
	
	}
	
	//get all books
	public List<Book> getAllBooks()
	{
		return list;
	}
//get single book by id
	public Book getBookbyId(int id)
	{
		Book book=null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
}
