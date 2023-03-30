package org.tech_pod.model;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import javax.persistence.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Entity(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column (name = "age")
    private int age;

    @Column (name = "email")
    private char[] email;

    @Column (name = "password")
    private char[] password;

    @Column (name = "bio")
    private String bio;

    @Column (name = "occupation")
    private String occupation;

    @Column (name = "websites")
    private URL websites;

//    @Column (name = "event")
//    private List<Event> events;

//    @Column (name = "job_post")
//    private List<JobPost> jobPosts;

//    @Column (name = "blog_post")
//    private List<BlogPost> blogPosts;
//
//    @Column (name = "resource")
//    private List<Resource> resources;

    @OneToMany(mappedBy = "user")
    private List<Event> events;

    @OneToMany(mappedBy = "user")
    private List<JobPost> jobPosts;

    @OneToMany(mappedBy = "user")
    private List<BlogPost> blogPosts;

    @OneToMany(mappedBy = "user")
    private List<Resource> resources;

    public User(String name, int age, char[] email, char[] password, String bio, String occupation, URL websites){
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.bio = bio;
        this.occupation = occupation;
        this.websites = websites;
        this.events = new ArrayList<>();
        this.jobPosts = new ArrayList<>();
        this.blogPosts = new ArrayList<>();
        this.resources = new ArrayList<>();
    }

    public User(){}

    // Getters & Setters

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public char[] getEmail() {return email;}

    public void setEmail(char[] email) {this.email = email;}

    public char[] getPassword() {return password;}

    public void setPassword(char[] password) {this.password = password;}

    public String getBio(){return bio;}

    public void setBio(String bio){this.bio = bio;}

    public String getOccupation(){return occupation;}

    public void setOccupation(String occupation) {this.occupation = occupation;}

    public URL getWebsites() {return websites;}

    public void setWebsites(URL websites){this.websites = websites;}

    public List<Event> getEvents() {return events;}

    public void setEvents(List<Event> events) {this.events = events;}

    public List<JobPost> getJobPosts() {return jobPosts;}

    public void setJobPosts(List<JobPost> jobPosts){this.jobPosts = jobPosts;}

    public List<BlogPost> getBlogPosts() {return blogPosts;}

    public void setBlogPosts(List<BlogPost> blogPosts){this.blogPosts = blogPosts;}

    public List<Resource> getResources(){return resources;}

    public void setResources(List<Resource> resources){this.resources = resources;}




}

