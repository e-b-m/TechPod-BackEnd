package org.tech_pod.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech_pod.services.PostService;

@RestController
@RequestMapping ("/post")
public class PostController {

    @Autowired
    PostService postService;

}
