package com.helloUser.helloUser;

import java.util.UUID;

public class Member {

    private String name;
    private String eMail;
    private int age;
    private UUID id;

    Member(String name, String eMail, int age, UUID id) {
        this.name = name;
        this.eMail = eMail;
        this.age = age;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAge() {
        return age;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
