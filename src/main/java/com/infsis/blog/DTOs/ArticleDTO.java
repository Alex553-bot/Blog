package com.infsis.blog.DTOs;
public class ArticleDTO {
    private Integer id;
    private String title; 
    private String reference; 

    public ArticleDTO() {}
    public ArticleDTO(Integer id, String title, String reference) {
        this.title = title;
        this.reference = reference;
        this.id = id;
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
    
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
}