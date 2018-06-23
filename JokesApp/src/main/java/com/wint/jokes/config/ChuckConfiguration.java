/**
 * 
 */
package com.wint.jokes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author peter
 *
 */
//@Configuration
public class ChuckConfiguration {
	
	//@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
