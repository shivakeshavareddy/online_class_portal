package com.OnlineClassPortal.OnlineClassPortal.model;

import java.util.List;

public class user {
    private String name;
    private String email;
    private String password;
    private List<String> tech;
//    will add more attributes as need them


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getTech() {
        return tech;
    }

    public void setTech(List<String> tech) {
        this.tech = tech;
    }
}
