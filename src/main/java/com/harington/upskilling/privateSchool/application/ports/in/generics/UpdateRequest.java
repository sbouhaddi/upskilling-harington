package com.harington.upskilling.privateSchool.application.ports.in.generics;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;

public abstract class UpdateRequest<T extends DomainModel> {
    public abstract T toDomainModel();
}
