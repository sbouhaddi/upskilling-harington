package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model;

import com.harington.upskilling.privateSchool.application.domain.model.Subject;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "subject")
@Getter
@Setter
@NoArgsConstructor
public class SubjectEntity implements DataModel<Subject> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "libelle", nullable = false, length = 50)
    private String libelle;

    @Column(name = "description", length = 50)
    private String description;
}
