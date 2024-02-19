package com.harington.upskilling.privateSchool.application.ports.out;

import com.harington.upskilling.privateSchool.domain.model.DomainModel;

public interface CreateData<T extends DomainModel> {
    T save(T data);
}
