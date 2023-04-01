package org.tech_pod.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "author")
    private String author;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"Posts"})
    private User user;


    public Post(String title, LocalDate date, String author, String content, User user){
        this.title = title;
        this.date = date;
        this.author = author;
        this.content = content;
        this.user = user;
    }

    public Post(){

    }

    // Getters & Setters

    public String getTitle(){return title;}

    public void setTitle(String title){this.title = title;}

    public LocalDate getDate(){return date;}

    public void setDate(LocalDate date){this.date = date;}

    public String getAuthor(){return author;}

    public void setAuthor(String author){this.author = author;}

    public String getPost(){return content;}

    public void setPost(String content){this.content = content;}

    public  User getUser(){return user;}

    public void setUser(User user){this.user = user;}



}
