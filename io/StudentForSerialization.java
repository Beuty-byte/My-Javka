package io;

import java.io.Serializable;

public class StudentForSerialization implements Serializable {
    private String name;
    private int id;
    private transient String password;

    public StudentForSerialization(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
}
