package org.tech_pod.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "blogPost")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "author")
    private String author;

    @Column(name = "post")
    private String post;

   @ManyToOne
   @JoinColumn(name = "user_id")
   @JsonIgnoreProperties({"blogPosts"})
   private User user;


   public BlogPost(String title, LocalDate date, String author, String post, User user){
       this.title = title;
       this.date = date;
       this.author = author;
       this.post = post;
       this.user = user;
   }

   public BlogPost(){

   }

   // Getters & Setters

   public String getTitle(){return title;}

   public void setTitle(String title){this.title = title;}

   public LocalDate getDate(){return date;}

   public void setDate(LocalDate date){this.date = date;}

   public String getAuthor(){return author;}

   public void setAuthor(String author){this.author = author;}

   public String getPost(){return post;}

   public void setPost(String post){this.post = post;}

   public  User getUser(){return user;}

   public void setUser(User user){this.user = user;}



}
