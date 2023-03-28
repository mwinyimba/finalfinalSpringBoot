package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role , Long> {
}
