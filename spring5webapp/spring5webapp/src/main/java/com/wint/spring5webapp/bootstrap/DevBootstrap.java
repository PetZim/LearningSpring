package com.wint.spring5webapp.bootstrap;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.wint.spring5webapp.model.Author;
import com.wint.spring5webapp.model.Book;
import com.wint.spring5webapp.model.Publisher;
import com.wint.spring5webapp.repositories.AuthorRepository;
import com.wint.spring5webapp.repositories.BookRepository;
import com.wint.spring5webapp.repositories.PublisherRepository;

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
	private PublisherRepository publisherRepo;

	public DevBootstrap(AuthorRepository authorRepo, BookRepository bookRepo, PublisherRepository publisherRepo) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo = publisherRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();		
	}

	private void initData() {
		Publisher arctor = new Publisher("BobArctor", "Anaheim, California");
		Author dick = new Author("Phillip Kendrid", "Dick");
		Book asd = new Book("A Scanner Darkly", "1337");
		asd.getAuthors().add(dick);
		asd.setPublisher(arctor);
		
		Book br = new Book("Blade Runner", "09429");
		br.getAuthors().add(dick);
		br.setPublisher(arctor);
		
		dick.getBooks().add(asd);
		dick.getBooks().add(br);
		
		Author clarke = new Author("Arthur Charles", "Clarke");
		Book aso = new Book("2001: A Space Odyssey", "2001");
		clarke.getBooks().add(aso);
		aso.getAuthors().add(clarke);
		aso.setPublisher(arctor);
		
		publisherRepo.save(arctor);
		authorRepo.save(clarke);
		authorRepo.save(dick);
		bookRepo.save(asd);
		bookRepo.save(br);
		bookRepo.save(aso);
	}
}
