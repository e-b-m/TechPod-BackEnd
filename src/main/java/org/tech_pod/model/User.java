package org.tech_pod.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.net.URL;
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
}

