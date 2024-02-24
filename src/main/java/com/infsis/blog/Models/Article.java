// id - integer
// title string
// reference - string 
// createdAt - LocalDateTime
package com.infsis.blog.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Integer id; 
    private String title; 
    private String reference; 
    private LocalDateTime createdAt; 

    public Article() {
    }
    public Article(Integer id, String title, String reference, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.reference = reference;
        this.createdAt = createdAt;
    }
    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getReference() {
        return reference;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}