package com.mikehenry.graphqlclientdemo.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateStudentRequest {
    private String firstName;
    private String lastName;
    private String dob;
    private String address;
    private List<EnrolCourseRequest> enrolCourses;
}
