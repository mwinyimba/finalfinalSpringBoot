package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test , Long> {
}
