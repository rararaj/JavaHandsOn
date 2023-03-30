package com.texasmutual.interview;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.texasmutual.interview.domain.User;
import com.texasmutual.interview.repository.UserRepository;

@SpringBootApplication
public class JavaHandsOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaHandsOnApplication.class, args);
	}
	
	 @Bean
	 public ApplicationStartupRunner applicationStartupRunner() {
		 return new ApplicationStartupRunner();
	 }

}
