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
			AuthorRepository authorRespository,
			VideoRepository videoRepository,
			TextRepository textRepository,
			FileRepository fileRepository,
			CourseRepository courseRepository
	){
		return args -> {
			VideoResource video = VideoResource.builder()
					.length(5)
					.name("video-c")
					.build();
			TextResource text = TextResource.builder()
					.name("text-c")
					.content("this is the new content of that book is talking about some thing related to programming")
					.build();
			FileResource file = FileResource.builder()
					.name("file-c")
					.url("https://file.png")
					.type("image")
					.build();
//			Faker faker = new Faker();
//			for (int i = 0; i < 10; i++) {
//				Author author = Author.builder()
//						.firstName(faker.name().firstName())
//						.lastName(faker.name().lastName())
//						.age(faker.number().numberBetween(20, 50))
//						.email(faker.name().firstName() + "@gmail.com")
//						.build();
//				authorRespository.save(author);
//			}
/*			Author author = Author.builder()
					.id(11L)
					.firstName("khalil")
					.lastName("newbn")
					.age(21)
					.email("bn" + "@gmail.com")
					.build();
			authorRespository.save(author);*/
//			authorRespository.updateAuthorAge(22, 11L);
			authorRespository.findByNamedQuery(21);
			authorRespository.updateByNamedQuery(21, 11L);
//			Course course = Course.builder()
//					.title("java")
//					.description("java course for advanced level")
//					.authors(List.of(author))
//					.build();
//			courseRepository.save(course);
//			System.out.println(authorRespository.findAll());
		};
	}
}

