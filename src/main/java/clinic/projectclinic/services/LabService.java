package clinic.projectclinic.services;

import clinic.projectclinic.models.Lab;
import clinic.projectclinic.dto.RequestPatient;
import clinic.projectclinic.models.User;
import clinic.projectclinic.repositories.LabRepository;
import clinic.projectclinic.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LabService {
    @Autowired
    private LabRepository labRepository ;

    @Autowired
    private UserService userService;

    @Autowired
    UserRepository userRepository;


    public Lab insertLab(RequestPatient request) {
        User p = userRepository.findUserById(request.getPatientId());
        User measured = userRepository.findUserById(request.getLabTech());


        Lab l = new Lab();
        l.setPatients(p);
        l.setPressure(request.getPressure());
        l.setLabTech(measured);
        l.setHiv(request.getHiv());
        l.setWeight(request.getWeight());
        l.setAmount_blood(request.getAmount_blood());


        return labRepository.save(l);
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
