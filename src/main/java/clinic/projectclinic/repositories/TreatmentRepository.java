package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment , Long> {
}
