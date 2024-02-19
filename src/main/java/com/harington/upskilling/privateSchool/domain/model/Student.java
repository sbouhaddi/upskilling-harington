package com.harington.upskilling.privateSchool.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Student extends DomainModel {
    private long id;
    private String firstName;
    private String lastName;
    private String matricule;

    public Student(long id, String firstName, String lastName, String matricule) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.matricule = matricule;
    }

    public Student(String firstName, String lastName, String matricule) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matricule = matricule;
    }

    @Override
    public long id() {
        return id;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String matricule() {
        return matricule;
    }
}
