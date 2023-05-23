package org.tech_pod.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tech_pod.model.User;
import org.tech_pod.services.UserService;

import java.util.List;

@RestController
@RequestMapping ("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.OK);
        }

    @PatchMapping (value = "/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id){
        return new ResponseEntity<>(userService.updateUser(id, user), HttpStatus.ACCEPTED);
    }

    @DeleteMapping (value ="/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return new ResponseEntity("You have deleted your user", HttpStatus.OK);
    }

}
