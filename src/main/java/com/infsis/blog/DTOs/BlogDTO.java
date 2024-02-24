package com.infsis.blog.DTOs;

public class BlogDTO {
    private String name; 
    public BlogDTO() {}
    public BlogDTO(String name) {
        this.name = name;
    }
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
}