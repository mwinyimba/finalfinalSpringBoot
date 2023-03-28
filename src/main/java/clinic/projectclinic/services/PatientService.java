package clinic.projectclinic.services;

import clinic.projectclinic.models.Patient;
import clinic.projectclinic.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    public Optional<Patient> findById(Long id) {
        return  patientRepository.findById(id);
    }

    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }
}
