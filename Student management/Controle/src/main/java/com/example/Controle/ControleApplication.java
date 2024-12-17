package com.example.Controle;

import com.example.Controle.dao.entities.Student;
import com.example.Controle.dao.repository.StudentRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication

public class ControleApplication {
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

	@Bean
	CommandLineRunner start(){
		return args -> {
			List<Student> students = List.of(
					Student.builder()
							.id_Student(1)
							.name("adnane")
							.email("adnanmotya@gmail.com")
							.dateNaissance("01/06/2001")
							.build(),
					Student.builder()
							.id_Student(2)
							.name("test")
							.email("test1@gmail.com")
							.dateNaissance("01/01/2001")
							.build(),
					Student.builder()
							.id_Student(3)
							.name("test2")
							.email("test2@gmail.com")
							.dateNaissance("01/06/2002")
							.build(),
					Student.builder()
							.id_Student(4)
							.name("test3")
							.email("test3@gmail.com")
							.dateNaissance("31/06/2001")
							.build()
			);
			studentRepository.saveAll(students);
		};

	}
}
