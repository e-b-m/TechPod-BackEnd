package org.tech_pod.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech_pod.model.BlogPost;
import org.tech_pod.repositories.BlogPostRepository;
import java.util.List;

@Service
public class BlogPostService {

    @Autowired
    BlogPostRepository blogPostRepository;

    public List<BlogPost> getAllBlogPosts() {return blogPostRepository.findAll();}

    public BlogPost createBlogPost(BlogPost blogPost) {
        blogPostRepository.save(blogPost);
        return blogPost;
    }

    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }

}


