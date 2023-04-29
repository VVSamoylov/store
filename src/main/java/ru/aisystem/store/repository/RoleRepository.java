package ru.aisystem.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aisystem.store.entity.security.Role;

/**
 *
 * @author venia
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
