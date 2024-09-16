package com.example.teste2;

import com.example.teste2.entities.Student;
import com.example.teste2.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Teste2Application {

	public static void main(String[] args) {

		SpringApplication.run(Teste2Application.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return runner -> {
			saveStudent(new Student("Primeiro Nome Test","Segundo Nome Test","email@gmail.com"), studentRepository);
		};

}

	private void saveStudent(Student student, StudentRepository studentRepository) {

		studentRepository.save(student);
	}
	}
