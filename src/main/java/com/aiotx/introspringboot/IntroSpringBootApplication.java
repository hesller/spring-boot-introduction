package com.aiotx.introspringboot;

import com.aiotx.introspringboot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class IntroSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroSpringBootApplication.class, args);
    }


}
