package com.harington.upskilling.privateSchool.application.domain.model;

public record Classe(long id, String libelle, String description) implements DomainModel {
    public Classe(String libelle, String description) {
        this(IdGenerator.id(), libelle, description);
    }

    @Override
    public long id() {
        return id;
    }
}
