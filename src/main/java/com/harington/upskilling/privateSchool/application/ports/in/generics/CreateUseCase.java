package com.harington.upskilling.privateSchool.application.ports.in.generics;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;

public interface CreateUseCase<C extends CreateRequest<?>, T extends DomainModel> {
    T create(C createRequest);
}
