package com.texasmutual.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
