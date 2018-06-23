/**
 * 
 */
package com.wint.jokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author peter
 *
 */
@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeServiceImpl() {
		super();
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	/* (non-Javadoc)
	 * @see com.wint.jokes.services.JokeService#getJoke()
	 */
	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
