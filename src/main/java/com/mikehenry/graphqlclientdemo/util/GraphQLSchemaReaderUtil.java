package com.mikehenry.graphqlclientdemo.util;

import java.io.IOException;

public class GraphQLSchemaReaderUtil {

    private GraphQLSchemaReaderUtil(){}

    public static String readSchemaFromFile(final String schemaName) throws IOException {
        return new String (GraphQLSchemaReaderUtil.class.getClassLoader()
                .getResourceAsStream("graphql/"+schemaName+".graphql")
                .readAllBytes());
    }
}
