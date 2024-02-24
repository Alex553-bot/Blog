package com.infsis.blog.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue
    private Integer id; 
    private String name; 
    private LocalDateTime createdAt;

    public Blog() {
    }
    public Blog(Integer id, String name, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }
    public Integer getId() {return id;}
    public String getName() {return name;}
    public LocalDateTime getCreatedAt() {return createdAt;}
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}