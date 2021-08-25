package com.sample.graphql.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String name;
    private int age;
    private String phone;
    private Address address;


}
