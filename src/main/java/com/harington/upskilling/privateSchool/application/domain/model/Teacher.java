package com.harington.upskilling.privateSchool.application.domain.model;

import jakarta.validation.constraints.NotBlank;

public record Teacher(long id, @NotBlank String firstName, @NotBlank String lastName, @NotBlank String matricule)
        implements DomainModel {
    public Teacher(@NotBlank String firstName, @NotBlank String lastName, @NotBlank String matricule) {
        this(IdGenerator.id(), firstName, lastName, matricule);
    }

    @Override
    public long id() {
        return id;
    }
}
