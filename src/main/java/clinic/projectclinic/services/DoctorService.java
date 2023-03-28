package clinic.projectclinic.services;

import clinic.projectclinic.models.Doctor;
import clinic.projectclinic.repositories.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepo doctorRepo;

    public Doctor addDoctor(Doctor d) {
        return doctorRepo.save(d);
    }


    public List<Doctor> getAll() {
        return doctorRepo.findAll();
    }

    public Optional<Doctor> getById(Long id) {
        return doctorRepo.findById(id);
    }

    public void deleteById(Long id) {
        doctorRepo.deleteById(id);
    }
}
