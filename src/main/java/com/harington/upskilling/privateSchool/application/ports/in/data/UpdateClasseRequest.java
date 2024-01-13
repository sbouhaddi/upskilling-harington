package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.application.ports.in.generics.UpdateRequest;
import com.harington.upskilling.privateSchool.domain.model.Classe;

public class UpdateClasseRequest extends UpdateRequest<Classe> {

    @Override
    public Classe toDomainModel() {
        return null;
    }
}
