package org.tech_pod.model;


import javax.persistence.*;

@Entity(name="user_profiles")
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






}

