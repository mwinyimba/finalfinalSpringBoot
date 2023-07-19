package clinic.projectclinic.services;

import clinic.projectclinic.models.Lab;
import clinic.projectclinic.models.RequestPatient;
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
        Optional<User> p = userRepository.findById(request.getPatientId());
        Optional<User> measured = userService.findById(request.getLabId());

        User userPatient = p.get();

        User userMeas = measured.get();



        Lab l = new Lab();
        l.setPatients(userPatient);
        l.setPressure(request.getPressure());
        l.setLabTech(userMeas);
        l.setHiv(request.getHiv());
        l.setWeight(request.getWeight());
        l.setAmount_blood(request.getAmount_blood());
        labRepository.save(l);
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
