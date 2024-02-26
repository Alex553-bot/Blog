package com.infsis.blog.DTOs;
public class RoleDTO {
    private Integer id;
    private String name; 
    
    public RoleDTO() {}
    
    public RoleDTO(Integer id, String name) {
        this.name = name;
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
}