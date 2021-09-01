package com.developersmill.projectgrizzly;

public class UserDTO {

    private final String name;

    private final int age;

    public UserDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
