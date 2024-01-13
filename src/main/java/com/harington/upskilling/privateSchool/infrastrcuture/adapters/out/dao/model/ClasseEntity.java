package com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.model;

import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "classe")
@Getter
@Setter
@NoArgsConstructor
public class ClasseEntity implements DataModel<Classe> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "libelle", nullable = false, length = 15)
    private String libelle;

    @Column(name = "description", length = 50)
    private String description;
}
