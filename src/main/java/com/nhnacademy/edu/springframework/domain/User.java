package com.nhnacademy.edu.springframework.domain;

public class User {
    private String name;
    private String text;
    public User(String name, String text) {
        this.name = name;
        this.text = text;
    }
    public String getName() {
        return name;
    }
    public String getText() {
        return text;
    }
}
