package com.bn.courses;

import com.bn.courses.model.Author;
import com.bn.courses.model.Course;
import com.bn.courses.model.resources.FileResource;
import com.bn.courses.model.resources.TextResource;
import com.bn.courses.model.resources.VideoResource;
import com.bn.courses.repositories.AuthorRepository;
import com.bn.courses.repositories.CourseRepository;
import com.bn.courses.repositories.ResourceRepositories.FileRepository;
import com.bn.courses.repositories.ResourceRepositories.TextRepository;
import com.bn.courses.repositories.ResourceRepositories.VideoRepository;
import com.bn.courses.service.AuthorService;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRuner(
			AuthorService authorService
	){
		return args -> {

		};
	}
}

