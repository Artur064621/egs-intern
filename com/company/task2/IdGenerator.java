package com.company.task2;

public class IdGenerator {

    private static long id = 0;

    public static long nextId() {
        id++;
        return id;
    }
}