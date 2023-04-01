package org.tech_pod.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tech_pod.model.User;

import java.util.List;

@Repository
public interface JobPostRepository extends JpaRepository {

    List<User> findByNameEquals(String name);

}
