package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model;

import com.harington.upskilling.privateSchool.application.domain.model.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "student")
public class StudentEntity implements DataModel<Student> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "matricule", nullable = false, length = 15)
    private String matricule;
}
