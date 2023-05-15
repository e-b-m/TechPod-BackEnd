package org.tech_pod.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech_pod.services.ResourceService;


@RestController
@RequestMapping ("/resource")
public class ResourceController {
    @Autowired
    ResourceService resourceService;
}
