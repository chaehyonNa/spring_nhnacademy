package com.nhnacademy.edu.springframework.domain;

public class User {
    private String email;
    private String phoneNumaver;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public User(String email, String phoneNumaver) {
        this.email = email;
        this.phoneNumaver = phoneNumaver;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumaver() {
        return phoneNumaver;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumaver(String phoneNumaver) {
        this.phoneNumaver = phoneNumaver;
    }
}
