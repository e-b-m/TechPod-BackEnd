package org.tech_pod.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech_pod.services.PostService;
import org.tech_pod.services.UserService;

@RestController
@RequestMapping ("/user")
public class UserController {
    @Autowired
    UserService userService;

}
