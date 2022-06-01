package com.mikehenry.graphqlclientdemo.service;

import com.mikehenry.graphqlclientdemo.request.CreateStudentRequest;
import com.mikehenry.graphqlclientdemo.response.StudentResponse;

public interface StudentService {

    StudentResponse getStudent(Long id);

    StudentResponse createStudent(CreateStudentRequest createStudentRequest);
}
