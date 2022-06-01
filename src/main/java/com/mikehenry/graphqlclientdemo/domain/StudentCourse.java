package com.mikehenry.graphqlclientdemo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentCourse {

    private Long id;
    private Course course;
    private Integer active = 1;
}
