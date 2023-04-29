package ru.aisystem.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aisystem.store.entity.security.User;

/**
 *
 * @author venia
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
