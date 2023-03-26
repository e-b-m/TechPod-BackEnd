package org.tech_pod.model;


import javax.persistence.*;

@Entity(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;



}

