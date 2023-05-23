package org.tech_pod.controllers;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tech_pod.model.Resource;
import org.tech_pod.services.ResourceService;

import java.util.List;


@RestController
@RequestMapping ("/resource")
public class ResourceController {
    @Autowired
    ResourceService resourceService;

    @GetMapping
    public ResponseEntity<List<Resource>> getAllResources(){
        return new ResponseEntity<>(resourceService.getAllResources(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Resource> createResource(@RequestBody Resource resource){
        return new ResponseEntity<>(resourceService.createResource(resource), HttpStatus.OK);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity deleteResource(@PathVariable Long id){
        resourceService.deleteResource(id);
        return new ResponseEntity("This resource has been successfully deleted", HttpStatus.OK);
    }

}
