package org.tech_pod.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.tech_pod.model.User;
import java.util.List;

public interface BlogPostRepository extends JpaRepository {
    List<User> findByNameEquals(String name);
}
