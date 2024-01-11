package com.harington.upskilling.privateSchool.infrastrcuture.adapters.in.rest;

import com.harington.upskilling.privateSchool.application.ports.in.generics.DeleteUseCase;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class DeleteController<S extends DeleteUseCase> {

    S deleteUseCase;

    public DeleteController(S deleteUseCase) {
        this.deleteUseCase = deleteUseCase;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        deleteUseCase.delete(id);
    }
}
