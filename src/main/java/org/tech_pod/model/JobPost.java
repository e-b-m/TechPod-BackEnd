package org.tech_pod.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "job_posts")
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "deadline")
    private LocalDate deadline;

    @Column(name = "location")
    private String location;

    @Column(name = "salary")
    private int salary;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"jobPosts"})
    private User user;

    public JobPost (String title, LocalDate startDate, LocalDate deadline, String location, int salary, String description, User user){
        this.title = title;
        this.startDate = startDate;
        this.deadline = deadline;
        this.location = location;
        this.salary = salary;
        this.description = description;
        this.user = user;
    }

    public JobPost(){}

    // Getters & Setters

    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}

    public LocalDate getStartDate(){return startDate;}
    public void setStartDate(LocalDate startDate){this.startDate = startDate;}

    public LocalDate getDeadline(){return deadline;}
    public void setDeadline(LocalDate deadline){this.deadline = deadline;}

    public String getLocation(){return location;}
    public void setLocation(String location){this.location=location;}

    public int getSalary(){return salary;}
    public void setSalary(int salary){this.salary = salary;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public User getUser(){return user;}
    public void setUser(User user){this.user = user;}

}
