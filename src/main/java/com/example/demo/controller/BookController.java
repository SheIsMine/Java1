package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Book;
import com.example.demo.dao.BookDao;

@RestController
@RequestMapping(value="/book")
public class BookController {

	@Autowired
	private BookDao bd;
	
	
	@GetMapping("/list")
	public List<Book> list(){
		return bd.getBook();
		
	}
}
