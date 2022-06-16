package com.aiotx.introspringboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam>@example.com",
                    LocalDate.of(1991, Month.MAY, 23)
            );

            Student alex = new Student(
                    "Alex",
                    "alex>@example.com",
                    LocalDate.of(2000, Month.JUNE, 15)
            );

            studentRepository.saveAll(List.of(mariam, alex));
        };
    }
}
