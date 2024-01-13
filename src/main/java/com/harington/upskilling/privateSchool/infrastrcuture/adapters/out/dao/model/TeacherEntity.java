package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model;

import com.harington.upskilling.privateSchool.application.domain.model.Teacher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "teacher")
public class TeacherEntity implements DataModel<Teacher> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "libelle", nullable = false, length = 15)
    private String libelle;

    @Column(name = "descritption", length = 50)
    private String descritption;
}
