package clinic.projectclinic.services;

import clinic.projectclinic.models.Lab;
import clinic.projectclinic.repositories.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LabService {
    @Autowired
    private LabRepository labRepository ;

    public Lab addlab(Lab lab) {
        return labRepository.save(lab);
    }

    public List<Lab> getAll() {
        return labRepository.findAll();
    }

    public Optional<Lab> findById(Long id) {
        return labRepository.findById(id);
    }

    public void deleteById(Long id) {
        labRepository.deleteById(id);
    }
}
