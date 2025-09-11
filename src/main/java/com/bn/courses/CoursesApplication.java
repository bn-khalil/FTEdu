package com.bn.courses;

import com.bn.courses.model.resources.FileResource;
import com.bn.courses.model.resources.TextResource;
import com.bn.courses.model.resources.VideoResource;
import com.bn.courses.repositories.AuthorRepository;
import com.bn.courses.repositories.ResourceRepositories.FileRepository;
import com.bn.courses.repositories.ResourceRepositories.TextRepository;
import com.bn.courses.repositories.ResourceRepositories.VideoRepository;
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
	public CommandLineRunner commandLineRuner(
			AuthorRepository authorRespository,
			VideoRepository videoRepository,
			TextRepository textRepository,
			FileRepository fileRepository
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
			videoRepository.save(video);
			textRepository.save(text);
			fileRepository.save(file);
		};
	}
}

