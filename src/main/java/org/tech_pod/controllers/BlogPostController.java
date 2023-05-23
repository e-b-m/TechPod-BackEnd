package org.tech_pod.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tech_pod.model.BlogPost;
import org.tech_pod.services.BlogPostService;
import org.tech_pod.services.UserService;
import java.util.List;

@RestController
@RequestMapping("/blogpost")
public class BlogPostController {

    @Autowired
    BlogPostService blogPostService;

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<BlogPost>> getAllBlogPosts(){
    List<BlogPost> blogPosts = blogPostService.getAllBlogPosts();
    return new ResponseEntity<>(blogPosts, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BlogPost> createBlogPost(@RequestBody BlogPost blogPost) {
        return new ResponseEntity<>(blogPostService.createBlogPost(blogPost), HttpStatus.OK);
    }

    @DeleteMapping (value ="/{id}")
    public ResponseEntity deleteBlogPost(@PathVariable Long id){
        blogPostService.deleteBlogPost(id);
        return new ResponseEntity("You successfully deleted the post", HttpStatus.OK);
    }


}
