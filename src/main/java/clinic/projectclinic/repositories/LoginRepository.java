package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
}
