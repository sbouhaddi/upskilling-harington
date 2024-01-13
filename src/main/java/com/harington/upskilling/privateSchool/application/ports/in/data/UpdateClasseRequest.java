package com.harington.upskilling.privateSchool.application.ports.in.data;

import com.harington.upskilling.privateSchool.domain.model.Classe;
import com.harington.upskilling.privateSchool.application.ports.in.generics.UpdateRequest;

public class UpdateClasseRequest extends UpdateRequest<Classe> {

    @Override
    public Classe toDomainModel() {
        return null;
    }
}
