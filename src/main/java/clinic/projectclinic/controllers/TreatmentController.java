package clinic.projectclinic.controllers;

import clinic.projectclinic.dto.RequestLab;
import clinic.projectclinic.models.Patient;
import clinic.projectclinic.models.Treatment;
import clinic.projectclinic.services.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("api/treatment")
public class TreatmentController {
    @Autowired
    private TreatmentService treatmentService;

    @PostMapping("/")
    public Treatment insertTreatment(@RequestBody RequestLab request){
        return treatmentService.insertTreatment(request);
    }
    @GetMapping("/")
    public List<Treatment> getAll(){
        return treatmentService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Treatment> getById(@PathVariable Long id){
        return treatmentService.findById(id);
    }
    @GetMapping("/patient/{id}")
    public List<Treatment> getByIdPatient(@PathVariable Long id){
        List<Treatment>  t = treatmentService.findByIdPatient(id);
    return t;
    }
    @PutMapping("/{id}")
    public  Treatment updateTreatment(@RequestBody RequestLab request , @PathVariable Long id){
        return  treatmentService.insertTreatment(request);
    }


}
