package com.mikehenry.graphqlclientdemo.response;

import com.mikehenry.graphqlclientdemo.domain.StudentCourse;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class StudentResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String address;
    private List<StudentCourse> studentCourses = new ArrayList<>();
    private String fullName;
}
