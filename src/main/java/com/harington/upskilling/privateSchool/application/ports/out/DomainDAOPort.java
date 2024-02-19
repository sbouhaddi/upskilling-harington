package com.harington.upskilling.privateSchool.application.ports.out;

import com.harington.upskilling.privateSchool.domain.model.DomainModel;

public interface DomainDAOPort<T extends DomainModel> extends GetData<T>, CreateData<T>, UpdateData<T>, DeletedData {}
