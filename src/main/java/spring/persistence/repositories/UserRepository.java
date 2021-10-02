package spring.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.persistence.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
