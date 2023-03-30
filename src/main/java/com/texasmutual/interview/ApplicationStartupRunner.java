package com.texasmutual.interview;

import java.util.function.Consumer;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.texasmutual.interview.domain.User;
import com.texasmutual.interview.repository.UserRepository;
/*
 * This class implements CommandLineRunner interface which is used to insert seed records in the H2 database.
 * This gets instantiated during application startup
 */
public class ApplicationStartupRunner implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository; 
	
	@Override
	public void run(String... args) throws Exception {
	    Consumer<String> userConsumer = name -> {
	        User user = new User();
	        user.setName(name);
	        user.setEmail(name + "@chucknorris.com");
	        userRepository.save(user);
	    };

	    Stream.of("Oliver", "Ava", "Emma", "Jackson", "Amelia").forEach(userConsumer);
	    
	    System.out.println("Following records are added to the H2 in memory database");
	    userRepository.findAll().forEach(user -> System.out.println(user.toString()));
	}

}
