package com.company.task2;

public interface UserStore {

    /**
     * Loads users from users.txt file
     */
    void load();

    void get();

    void add();

    void remove();

    /**
     * Save users from arrayList to users.txt file
     */
    void exit();

    void list();

}