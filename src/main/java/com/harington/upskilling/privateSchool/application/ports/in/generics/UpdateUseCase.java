package com.harington.upskilling.privateSchool.application.ports.in.generics;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;

public interface UpdateUseCase<U extends UpdateRequest<T>, T extends DomainModel> {
    T update(long id, U updateRequest);
}
