package com.example.springtest.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student karel = new Student(
                    "Karel",
                    "karel.nonedam@neznam.com",
                    LocalDate.of(2000, FEBRUARY, 7),
                    21
            );

            repository.saveAll(
                    List.of(karel)
            );
        };
    }
}
