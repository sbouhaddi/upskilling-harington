package com.harington.upskilling.privateSchool.application.ports.in.generics;

import com.harington.upskilling.privateSchool.domain.model.DomainModel;
import java.util.List;

public interface GetUseCase<T extends DomainModel> {
    List<T> getAll();

    T get(long id);
}
