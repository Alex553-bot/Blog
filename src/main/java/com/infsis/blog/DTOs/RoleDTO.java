package com.infsis.blog.DTOs;
public class RoleDTO {
    private String name; 
    public RoleDTO() {}
    public RoleDTO(String name) {
        this.name = name;
    }
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
}