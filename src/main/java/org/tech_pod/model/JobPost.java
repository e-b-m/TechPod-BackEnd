package org.tech_pod.model;
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


}
