package clinic.projectclinic.services;

import clinic.projectclinic.models.Treatment;
import clinic.projectclinic.repositories.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreatmentService {
    @Autowired
    private TreatmentRepository treatmentRepository;


    public Treatment addTreatment(Treatment treatment) {
        return treatmentRepository.save(treatment);
    }

    public List<Treatment> getAll() {
        return treatmentRepository.findAll();
    }

    public Optional<Treatment> findById(Long id) {
        return treatmentRepository.findById(id);
    }
}
