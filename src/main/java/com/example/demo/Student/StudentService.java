package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "George",
                        "chartounygeorge@gmail.com.",
                        LocalDate.of(1994, Month.JANUARY, 02),
                        21
                )
        );
    }
}