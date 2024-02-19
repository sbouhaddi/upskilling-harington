package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;
import com.harington.upskilling.privateSchool.domain.exceptions.DataValidationException;
import com.harington.upskilling.privateSchool.domain.model.Classe;
import java.util.Objects;

public record CreateClasseRequest(String libelle, String description) implements CreateRequest<Classe> {
    public CreateClasseRequest {
        try {
            Objects.requireNonNull(libelle);
        } catch (NullPointerException ex) {
            throw new DataValidationException("Le champs libelle est obligatoire");
        }
    }

    @Override
    public Classe toDomainModel() {
        return new Classe(libelle, description);
    }
}
