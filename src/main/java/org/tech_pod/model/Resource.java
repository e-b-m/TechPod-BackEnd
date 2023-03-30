package org.tech_pod.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.net.URL;

@Entity(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String company;

    @Column(name = "cost")
    private int cost;

    @Column(name = "description")
    private String description;

    @Column(name = "link")
    private URL link;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"blogPosts"})
    private User user;

    public Resource(String title, String company, int cost, String description, URL link, User user){
        this.title = title;
        this.company = company;
        this.cost = cost;
        this.description = description;
        this.link = link;
        this.user = user;

    }

    public Resource(){

    }

    public String getTitle(){ return title;}

    public void setTitle(String title){this.title = title;}

    public String getCompany(){return company;}

    public void setCompany(String company){this.company = company;}

    public int getCost(){return cost;}

    public void setCost(int cost){this.cost = cost;}

    public String getDescription(){return description;}

    public void setDescription(String description){this.description = description;}

    public URL getLink(){return link;}

    public void setLink(URL link){this.link = link;}

    public User getUser(){return user;}

    public void setUser(User user){this.user = user;}


}
