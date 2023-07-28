package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Treatment;
import clinic.projectclinic.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TreatmentRepository extends JpaRepository<Treatment , Long> {
    @Query("select t from Treatment t  JOIN t.labDetail l  where l.patients = ?1")
    List<Treatment> findByPatientId(User u);
    
}
