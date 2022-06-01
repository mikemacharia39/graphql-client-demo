package com.mikehenry.graphqlclientdemo.service;

import com.mikehenry.graphqlclientdemo.request.CreateStudentRequest;
import com.mikehenry.graphqlclientdemo.response.StudentResponse;

import java.io.IOException;

public interface StudentService {

    StudentResponse getStudent(Long id) throws IOException;

    StudentResponse createStudent(CreateStudentRequest createStudentRequest) throws IOException;
}
