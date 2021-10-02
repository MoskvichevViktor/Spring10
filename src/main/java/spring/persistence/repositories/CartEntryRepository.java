package spring.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.persistence.entities.Order;

public interface CartEntryRepository extends JpaRepository<Order, Long> {

}