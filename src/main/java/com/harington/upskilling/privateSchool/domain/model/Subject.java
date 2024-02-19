package com.harington.upskilling.privateSchool.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Subject extends DomainModel {
    private long id;
    private String libelle;
    private String description;

    public Subject(long id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }

    public Subject(String libelle, String description) {
        this.libelle = libelle;
        this.description = description;
    }

    @Override
    public long id() {
        return id;
    }

    public String libelle() {
        return libelle;
    }

    public String description() {
        return description;
    }
}
