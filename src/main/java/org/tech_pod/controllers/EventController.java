package org.tech_pod.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tech_pod.model.Event;
import org.tech_pod.model.User;
import org.tech_pod.services.EventService;
import org.tech_pod.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    UserService userService;

    @Autowired
    EventService eventService;

    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents(){
        return new ResponseEntity<>(eventService.getAllEvents(), HttpStatus.OK) ;
    }

    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event){
       return new ResponseEntity<>(eventService.createEvent(event), HttpStatus.OK);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity deleteEvent(@PathVariable Long id){
       eventService.deleteEvent(id);
       return new ResponseEntity("You successfull deleted this event", HttpStatus.OK);
    }

}
