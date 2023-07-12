package clinic.projectclinic.repositories;

import clinic.projectclinic.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {
}
