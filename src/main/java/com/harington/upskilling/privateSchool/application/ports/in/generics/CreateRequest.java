package com.harington.upskilling.privateSchool.application.ports.in.generics;

import com.harington.upskilling.privateSchool.domain.model.DomainModel;

public interface CreateRequest<T extends DomainModel> {
    T toDomainModel();
}
