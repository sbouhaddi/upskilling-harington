package com.harington.upskilling.privateSchool.application.ports.out;

import com.harington.upskilling.privateSchool.application.domain.model.DomainModel;

public interface GetData<T extends DomainModel> {

    T get(long id);
}
