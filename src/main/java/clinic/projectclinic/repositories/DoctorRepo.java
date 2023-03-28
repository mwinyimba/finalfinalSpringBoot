package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;



public interface DoctorRepo extends JpaRepository<Doctor,Long> {
}
