package org.tech_pod.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tech_pod.model.JobPost;
import org.tech_pod.services.JobPostService;

import java.util.List;

@RestController
@RequestMapping("/jobpost")
public class JobPostController {

    @Autowired
    JobPostService jobPostService;


    @GetMapping
    public ResponseEntity<List<JobPost>> getAllJobPosts(){
        List<JobPost> jobPosts = jobPostService.getAllJobPosts();
        return new ResponseEntity<>(jobPosts, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<JobPost> createJobPost(@RequestBody JobPost jobPost){
        return new ResponseEntity<>(jobPostService.createJobPost(jobPost), HttpStatus.OK);
    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity deleteJobPost(@PathVariable Long id){
        jobPostService.deleteJobPost(id);
        return new ResponseEntity("Job post has been successfully deleted", HttpStatus.OK);
    }



}
