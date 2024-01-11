package com.harington.upskilling.privateSchool.infrastrcuture.config;

import com.harington.upskilling.privateSchool.application.domain.service.ClasseService;
import com.harington.upskilling.privateSchool.application.domain.service.StudentService;
import com.harington.upskilling.privateSchool.application.domain.service.SubjectService;
import com.harington.upskilling.privateSchool.application.domain.service.TeacherService;
import com.harington.upskilling.privateSchool.application.ports.in.ClasseUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.StudentUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.SubjectUseCase;
import com.harington.upskilling.privateSchool.application.ports.in.TeacherUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Servicesconfig {

    @Bean
    public ClasseUseCase classeUseCase() {
        return new ClasseService();
    }

    @Bean
    public SubjectUseCase subjectUseCase() {
        return new SubjectService();
    }

    @Bean
    public TeacherUseCase teacherUseCase() {
        return new TeacherService();
    }

    @Bean
    public StudentUseCase studentUseCase() {

        return new StudentService();
    }
}
