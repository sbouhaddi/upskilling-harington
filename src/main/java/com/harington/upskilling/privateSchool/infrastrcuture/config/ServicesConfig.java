package com.harington.upskilling.privateSchool.infrastrcuture.config;

import com.harington.upskilling.privateSchool.application.ports.in.ClasseUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.StudentUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.SubjectUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.TeacherUseCase;
import com.harington.upskilling.privateSchool.domain.service.ClasseService;
import com.harington.upskilling.privateSchool.domain.service.StudentService;
import com.harington.upskilling.privateSchool.domain.service.SubjectService;
import com.harington.upskilling.privateSchool.domain.service.TeacherService;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.ClasseRepositoryAdapter;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.StudentRepositoryAdapter;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.SubjectRepositoryAdapter;
import com.harington.upskilling.privateSchool.infrastrcuture.adapters.out.dao.repository.TeacherRepositoryAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Autowired
    private ClasseRepositoryAdapter classeRepositoryAdapter;

    @Autowired
    private TeacherRepositoryAdapter teacherRepositoryAdapter;

    @Autowired
    private StudentRepositoryAdapter studentRepositoryAdapter;

    @Autowired
    private SubjectRepositoryAdapter subjectRepositoryAdapter;

    @Bean
    public ClasseUseCase classeUseCase() {
        return new ClasseService(classeRepositoryAdapter);
    }

    @Bean
    public SubjectUseCase subjectUseCase() {
        return new SubjectService(subjectRepositoryAdapter);
    }

    @Bean
    public TeacherUseCase teacherUseCase() {
        return new TeacherService(teacherRepositoryAdapter);
    }

    @Bean
    public StudentUseCase studentUseCase() {
        return new StudentService(studentRepositoryAdapter);
    }
}
