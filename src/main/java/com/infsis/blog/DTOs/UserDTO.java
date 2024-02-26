package com.infsis.blog.DTOs;
public class UserDTO {
    private Integer id;
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public UserDTO(Integer id, String name, String email) {
        this.name = name;
        this.email = email;
        this.id =id;
    }

    public String getName() {
        return name;
    }
    public Integer getId() {return id;}

    public UserDTO() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}