package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.application.domain.exceptions.DataValidationException;
import com.harington.upskilling.privateSchool.application.domain.model.Classe;
import com.harington.upskilling.privateSchool.application.ports.in.generics.CreateRequest;
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
