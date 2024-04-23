package com.example.Talller1;



import com.example.Talller1.persistence.entity.Personas;
import com.example.Talller1.persistence.repository.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	PersonasRepository personasRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
