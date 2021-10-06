package spring_boot_311.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_boot_311.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    //Optional<Role> findByName(String name);
}
