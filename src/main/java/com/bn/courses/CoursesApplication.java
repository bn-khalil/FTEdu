package com.bn.courses;

import com.bn.courses.model.Author;
import com.bn.courses.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRuner( AuthorRepository authorRespository){
		return args -> {
			Author author = Author.builder()
				.firstName("khalil")
				.lastName("bn")
				.email("bn@gmail.com")
				.age(21)
				.build();
			authorRespository.save(author);
			System.out.println(author.toString());
		};
	}
}

