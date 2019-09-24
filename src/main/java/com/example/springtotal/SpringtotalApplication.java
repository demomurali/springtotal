package com.example.springtotal;


import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringtotalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtotalApplication.class, args);
	}

	//@Bean
	public CommandLineRunner getCommandRunnder(ApplicationContext context){
		return (args)->{
			String names[]=context.getBeanDefinitionNames();
			
			Arrays.asList(names).stream()
			.sorted()
			.forEach(name->System.out.println(name));
			
			
		};
	}


}
