package com.infsis.blog.DTOs;
public class UserDTO {
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public UserDTO() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}