package com.helloUser.helloUser;

public class Member {

    private String name;
    private String eMail;
    private int age;
    private boolean admin;

    Member(String name, String eMail, int age, boolean admin) {
        this.name = name;
        this.eMail = eMail;
        this.age = age;
        this.admin = admin;
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

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

}
