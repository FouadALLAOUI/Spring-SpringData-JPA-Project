package com.riodan.SpringBootSpringDataJPA;

import com.riodan.SpringBootSpringDataJPA.models.Author;
import com.riodan.SpringBootSpringDataJPA.models.Video;
import com.riodan.SpringBootSpringDataJPA.repositories.AuthorRepository;
import com.riodan.SpringBootSpringDataJPA.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSpringDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository
	){
		return args -> {
			/*var author = Author.builder()
					.firstName("RIO")
					.lastName("Dan")
					.age(25)
					.email("riodan@gmail.com")
					.build();
			repository.save(author);*/

			var video = Video.builder()
					.name("ABC")
					.length(5)
					.build();
			videoRepository.save(video);

		};
	}








































































































































































}
