package com.example.springtest.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(new Student(
                1L,
                "Karel",
                "jaNejsemKarel@neznam.cz",
                LocalDate.of(1995, 12, 3),
                28
        ));
    }

}
