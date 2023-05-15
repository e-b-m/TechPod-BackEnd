package org.tech_pod.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech_pod.model.User;
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
    public ResponseEntity<List<User>> getAllUsers(){
       return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK) ;
    }
}
