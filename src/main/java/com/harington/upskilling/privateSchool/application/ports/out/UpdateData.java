package com.harington.upskilling.privateSchool.application.ports.out;

import com.harington.upskilling.privateSchool.domain.model.DomainModel;

public interface UpdateData<T extends DomainModel> {

    void update(long id, T data);
}
