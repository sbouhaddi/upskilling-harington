package com.harington.upskilling.privateSchool.application.domain.model;

import java.util.Random;

public class IdGenerator {

    public static long id() {
        Random random = new Random();
        return random.nextLong() % (9999 - 1000 + 1) + 1000;
    }
}
