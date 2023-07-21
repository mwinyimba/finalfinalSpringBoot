package clinic.projectclinic.services;

import clinic.projectclinic.dto.RequestLab;
import clinic.projectclinic.models.Lab;
import clinic.projectclinic.models.Treatment;
import clinic.projectclinic.models.User;
import clinic.projectclinic.repositories.LabRepository;
import clinic.projectclinic.repositories.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreatmentService {
    @Autowired
    private TreatmentRepository treatmentRepository;
    @Autowired
    private LabService labService;
    @Autowired
      LabRepository labRepository;


    public Treatment insertTreatment(RequestLab request) {
        Lab tr = labRepository.findLabById(request.getLabId());


        Treatment t = new Treatment();
        t.setLabDetail(tr);
        t.setMedicals(request.getMedical());
        t.setStatus(request.getStatus());
        t.setTreatedDate(request.getTreatedDate());
        t.setReturnDate(request.getReturnDate());
      return treatmentRepository.save(t);
    }
    public List<Treatment> getAll() {
        return treatmentRepository.findAll();
    }

    public Optional<Treatment> findById(Long id) {
        return treatmentRepository.findById(id);
    }


}
