package org.tech_pod.components;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.tech_pod.repositories.UserRepository;

@Component
public class DataLoader implements  ApplicationRunner {

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}

