package com.wint.spring5webapp.bootstrap;

import java.awt.List;
import java.util.Collections;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.wint.spring5webapp.model.Author;
import com.wint.spring5webapp.model.Book;
import com.wint.spring5webapp.repositories.AuthorRepository;
import com.wint.spring5webapp.repositories.BookRepository;

/**
 * This class will be used to initially populate H2 database.
 * 
 * @author peter
 *
 */
@Component
public class DevBootstrap 
	implements ApplicationListener<ContextRefreshedEvent>
{
	private AuthorRepository authorRepo;
	private BookRepository bookRepo;

	
	
	public DevBootstrap(AuthorRepository authorRepo, BookRepository bookRepo) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();		
	}

	private void initData() {
		Author dick = new Author("Phillip Kendrid", "Dick");
		Book asd = new Book("A Scanner Darkly", "1337", "Harper Collins");
		dick.getBooks().add(asd);
		asd.getAuthors().add(dick);
		Book br = new Book("Blade Runner", "09429", "Harper Collins");
		br.getAuthors().add(dick);
		
		authorRepo.save(dick);
		bookRepo.save(asd);
		bookRepo.save(br);
		
		Author clarke = new Author("Arthur Charles", "Clarke");
		Book aso = new Book("2001: A Space Odyssey", "2001", "Bob Arctor");
		clarke.getBooks().add(aso);
		aso.getAuthors().add(clarke);
		authorRepo.save(clarke);
		bookRepo.save(aso);
	}
}
