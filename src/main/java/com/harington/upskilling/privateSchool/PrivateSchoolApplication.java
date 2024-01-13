package com.harington.upskilling.privateSchool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrivateSchoolApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(PrivateSchoolApplication.class);
        Set<String> profiles =
                new HashSet<>(Arrays.asList(app.run(args).getEnvironment().getActiveProfiles()));
        System.out.println("Active profiles: " + profiles);
    }
}
