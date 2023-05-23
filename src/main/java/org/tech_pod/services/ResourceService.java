package org.tech_pod.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech_pod.model.Resource;
import org.tech_pod.repositories.ResourceRepository;
import java.util.List;

@Service
public class ResourceService {
    @Autowired
    ResourceRepository resourceRepository;

    public List<Resource> getAllResources(){
        return resourceRepository.findAll();
    }

    public Resource createResource(Resource resource){
        resourceRepository.save(resource);
        return resource;
    }

    public void deleteResource(Long id){
        resourceRepository.deleteById(id);
    }



}








