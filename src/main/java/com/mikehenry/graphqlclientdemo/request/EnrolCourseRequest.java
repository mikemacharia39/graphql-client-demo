package com.mikehenry.graphqlclientdemo.request;

import com.mikehenry.graphqlclientdemo.domain.CourseNameFilter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnrolCourseRequest {

    private CourseNameFilter course;
}
