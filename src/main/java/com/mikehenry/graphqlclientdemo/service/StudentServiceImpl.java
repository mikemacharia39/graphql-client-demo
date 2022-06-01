package com.mikehenry.graphqlclientdemo.service;

import com.mikehenry.graphqlclientdemo.domain.CourseNameFilter;
import com.mikehenry.graphqlclientdemo.request.CreateStudentRequest;
import com.mikehenry.graphqlclientdemo.response.StudentResponse;
import com.mikehenry.graphqlclientdemo.util.GraphQLSchemaReaderUtil;
import graphql.kickstart.spring.webclient.boot.GraphQLRequest;
import graphql.kickstart.spring.webclient.boot.GraphQLResponse;
import graphql.kickstart.spring.webclient.boot.GraphQLWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final GraphQLWebClient graphQLWebClient;

    @Override
    public StudentResponse getStudent(Long id) throws IOException {
        final String query = GraphQLSchemaReaderUtil.readSchemaFromFile("getStudentDetails");
        Map<String, Object> variables = new HashMap<>();
        variables.put("studentId", id);
        variables.put("courseNameFilter", List.of(CourseNameFilter.ALL));

        GraphQLRequest graphQLRequest = GraphQLRequest.builder()
                .query(query)
                .variables(variables)
                .build();

        GraphQLResponse response = graphQLWebClient.post(graphQLRequest).block();

        return response.get("getStudent", StudentResponse.class);
    }

    @Override
    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {
        return null;
    }
}
