package org.tech_pod.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech_pod.repositories.PostRepository;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;
}
