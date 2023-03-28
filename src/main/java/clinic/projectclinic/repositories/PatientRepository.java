package clinic.projectclinic.repositories;


import clinic.projectclinic.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository <Patient, Long>{
}
