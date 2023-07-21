package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Lab;
import clinic.projectclinic.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LabRepository extends JpaRepository<Lab , Long> {
    @Query("select l from Lab l where id = ?1")
    Lab findLabById(Long id);
}
