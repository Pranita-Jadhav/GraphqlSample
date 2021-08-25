package com.sample.graphql.service;

import com.sample.graphql.model.Student;

public interface StudentService {
    public Student getStudentDetailsByName(String name);

    public Student createStudentRecord(Student student);
}
