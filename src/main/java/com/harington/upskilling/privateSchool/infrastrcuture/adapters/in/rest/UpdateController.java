package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;
import com.harington.upskilling.privateSchool.application.ports.in.generics.UpdateRequest;
import com.harington.upskilling.privateSchool.application.ports.in.generics.UpdateUseCase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class UpdateController<
        S extends UpdateUseCase<U, T>, T extends DomainModel, U extends UpdateRequest<T>> {

    private S updateUseCase;

    public UpdateController(S updateUseCase) {
        this.updateUseCase = updateUseCase;
    }

    public void update(@PathVariable("id") long id, @RequestBody U updateClasseRequest) {
        updateUseCase.update(id, updateClasseRequest);
    }
}
