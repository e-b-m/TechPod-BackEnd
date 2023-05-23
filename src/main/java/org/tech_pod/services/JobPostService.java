package org.tech_pod.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech_pod.model.JobPost;
import org.tech_pod.repositories.JobPostRepository;

import java.util.List;

@Service
public class JobPostService {

    @Autowired
    JobPostRepository jobPostRepository;

    public List<JobPost> getAllJobPosts() { return (List<JobPost>) jobPostRepository;}

    public JobPost createJobPost(JobPost jobPost) {
        jobPostRepository.save(jobPost);
        return jobPost;
    }

    public void deleteJobPost (Long id){
        jobPostRepository.deleteById(id);
    }
}
