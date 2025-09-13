package com.bn.courses;

import com.bn.courses.mapper.AuthorMapper;
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
import com.bn.courses.service.CourseService;
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
			AuthorService authorService,
			CourseRepository courseRepository,
			AuthorMapper authorMapper
	){
		return args -> {
//			Course course = Course.builder()
//					.title("c course")
//					.description("it cover many important things about c")
//					.authors(List.of(
//							authorMapper.toAuthor(authorService.findAuthorById(1L)),
//							authorMapper.toAuthor(authorService.findAuthorById(2L))
//					))
//					.build();
//			courseRepository.save(course);
//			courseService.findAllCoursesByAuthorId(1L).forEach(e -> System.out.println(e.getTitle()));
//			authorService.findAuthorsById(11L);
//			authorService.findAuthorsById(1L);
//			authorService.findAuthorsById(2L);
		};
	}
}

