package com.example.hibtesting.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


    public Student(final String firstName, final String lastName, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {
    }
}
