package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Book;

@Repository
public class BookDao {

	@Autowired
	private JdbcTemplate Template;
	
	public List<Book> getBook(){
		String sql ="SELECT isbn id,NAME,price FROM book";
		RowMapper<Book> row = new BeanPropertyRowMapper<Book>(Book.class);
		
		List<Book> list = Template.query(sql, row);
		return list;
	}
	
	
}
