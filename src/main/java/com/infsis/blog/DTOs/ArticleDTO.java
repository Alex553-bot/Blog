package com.infsis.blog.DTOs;
public class ArticleDTO {
    private String title; 
    private String reference; 

    public ArticleDTO() {}
    public ArticleDTO(String title, String reference) {
        this.title = title;
        this.reference = reference;
    }

    public String getTitle() {return title;}
    public String getReference() {return reference;}
    public void setReference(String reference) {
        this.reference = reference;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}