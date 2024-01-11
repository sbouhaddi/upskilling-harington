package com.harington.upskilling.privateSchool.application.ports.in.generics;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;
import java.util.List;

public interface CrudUseCase<T extends DomainModel, C extends CreateRequest<T>, U extends UpdateRequest<T>>
        extends CreateUseCase<C, T>, UpdateUseCase<U, T>, GetUseCase<T>, DeleteUseCase {

    T create(C request);

    T update(long id, U request);

    T get(long id);

    List<T> getAll();

    void delete(long id);
}
