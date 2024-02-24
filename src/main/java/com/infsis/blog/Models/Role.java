package com.infsis.blog.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Role {
    @Id
    @GeneratedValue
    private Integer id; 
    private String name; 
    public Role() {}
    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {return id;}
    public String getName() {return name;}
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}