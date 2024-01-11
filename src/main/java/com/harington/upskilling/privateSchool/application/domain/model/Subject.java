package com.harington.upskilling.privateSchool.application.domain.model;

import jakarta.validation.constraints.NotBlank;

public record Subject(long id, @NotBlank String libelle, String description) implements DomainModel {

    public Subject(String libelle, String description) {
        this(IdGenerator.id(), libelle, description);
    }

    @Override
    public long id() {
        return id;
    }
}
