package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student George = new Student(
                    1L,
                    "George",
                    "chartounygeorge@gmail.com.",
                    LocalDate.of(1994, Month.JANUARY, 02),
                    21
            );
            Student Hanna = new Student(
                    2L,
                    "Hanna",
                    "hanna@gmail.com.",
                    LocalDate.of(1900, Month.FEBRUARY, 07),
                    21
            );
            repository.saveAll(
                    List.of(George, Hanna)
            );
        };
    }
}
