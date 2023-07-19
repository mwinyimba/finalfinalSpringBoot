package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Patient;
import clinic.projectclinic.models.Treatment;
import clinic.projectclinic.services.TreatmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/treatment")
public class TreatmentController {
    @Autowired
    private TreatmentService treatmentService;

    @PostMapping("/")
    public Treatment addTreatment(@RequestBody Treatment treatment){
        return treatmentService.addTreatment(treatment);
    }
    @GetMapping("/")
    public List<Treatment> getAll(){
        return treatmentService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Treatment> getById(@PathVariable Long id){
        return treatmentService.findById(id);
    }
    @PutMapping("/{id}")
    public  Treatment updateTreatment(@RequestBody Treatment treatment , @PathVariable Long id){
        return  treatmentService.addTreatment(treatment);
    }


}
