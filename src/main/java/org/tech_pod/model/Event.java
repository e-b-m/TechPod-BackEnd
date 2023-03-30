package org.tech_pod.model;

import javax.persistence.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity (name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "location")
    private String location;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "link")
    private URL link;

    @Column (name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Event(String name, LocalDate date, String location, LocalTime time, URL link, String description, User user){
        this.name = name;
        this.date = date;
        this.location = location;
        this.time = time;
        this.link = link;
        this.description = description;
        this.user = user;
    }

    public Event(){

    }

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
