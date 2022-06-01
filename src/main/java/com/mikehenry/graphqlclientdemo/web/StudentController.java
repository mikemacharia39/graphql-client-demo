package com.mikehenry.graphqlclientdemo.web;

import com.mikehenry.graphqlclientdemo.request.CreateStudentRequest;
import com.mikehenry.graphqlclientdemo.response.StudentResponse;
import com.mikehenry.graphqlclientdemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequestMapping("api/student")
@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/{id}")
    public StudentResponse getStudent(@PathVariable(name = "id") Long id) throws IOException {
        return studentService.getStudent(id);
    }

    @PostMapping("/create")
    public StudentResponse createStudent(@RequestBody CreateStudentRequest createStudentRequest) throws IOException {
        return studentService.createStudent(createStudentRequest);
    }
}
