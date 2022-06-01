# graphql-client-demo

## Who is the provider?
Checkout https://github.com/mikemacharia39/graphql-demo

The provider runs on the endpoint -> http://localhost:8084/graphql

## API Doc

Get Student
http://localhost:8085/api/student/{id}

Response
````json
{
    "id": 24,
    "firstName": "Mike",
    "lastName": "Doe",
    "dob": "1990-02-02",
    "address": "22nd Street",
    "studentCourses": [
        {
            "id": 47,
            "course": {
                "id": 1,
                "code": "CCC_001",
                "name": "Introduction to programming"
            },
            "active": 1
        },
        {
            "id": 48,
            "course": {
                "id": 3,
                "code": "HIV_003",
                "name": "HIV and AIDS"
            },
            "active": 1
        },
        {
            "id": 49,
            "course": {
                "id": 2,
                "code": "CCC_002",
                "name": "Introduction to Calculus 1"
            },
            "active": 1
        },
        {
            "id": 50,
            "course": {
                "id": 8,
                "code": "CCC_008",
                "name": "Programming Basics"
            },
            "active": 1
        }
    ],
    "fullName": "Hannah Montana"
}
````

Create Student
http://localhost:8085/api/student/create

Request
````json
{
    "firstName": "Mike",
    "lastName": "Doe",
    "dob": "1990-02-02",
    "address": "22nd Street",
    "enrolCourses": [
        {
            "course": "CCC_001"
        },
        {
            "course": "HIV_003"
        },
        {
            "course": "CCC_002"
        },
        {
            "course": "CCC_008"
        }
    ]
}
````

Response
````json
{
    "id": 24,
    "firstName": "Mike",
    "lastName": "Doe",
    "dob": "1990-02-02",
    "address": "22nd Street",
    "studentCourses": [
        {
            "id": 47,
            "course": {
                "id": 1,
                "code": "CCC_001",
                "name": "Introduction to programming"
            },
            "active": 1
        },
        {
            "id": 48,
            "course": {
                "id": 3,
                "code": "HIV_003",
                "name": "HIV and AIDS"
            },
            "active": 1
        },
        {
            "id": 49,
            "course": {
                "id": 2,
                "code": "CCC_002",
                "name": "Introduction to Calculus 1"
            },
            "active": 1
        },
        {
            "id": 50,
            "course": {
                "id": 8,
                "code": "CCC_008",
                "name": "Programming Basics"
            },
            "active": 1
        }
    ],
    "fullName": "Hannah Montana"
}
````