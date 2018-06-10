/**
 * 
 */
package com.wint.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wint.spring5webapp.repositories.BookRepository;

/**
 * @author peter
 *
 */
@Controller
public class BookController 
{
	private BookRepository bookRepository;
	
	public BookController(com.wint.spring5webapp.repositories.BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books"; // returning the VIEW name -> Spring will know which view to use then
	}
}
