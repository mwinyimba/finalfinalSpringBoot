package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Lab;
import clinic.projectclinic.models.Patient;
import clinic.projectclinic.services.LabService;
import clinic.projectclinic.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping ("/api/lab")
public class LabController {
    @Autowired
    private LabService labService ;

    @PostMapping("/")
    public Lab addlab(@RequestBody Lab lab){
        return labService.addlab(lab);
    }
    @GetMapping("/")
    public List<Lab> getAll(){
        return labService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Lab> getById(@PathVariable Long id){
        return labService.findById(id);
    }
    @PutMapping("/{id}")
    public  Lab updateLab(@RequestBody Lab lab , @PathVariable Long id){
        return  labService.addlab(lab);
    }
    @DeleteMapping("/{id}")
    public void deleteLab(@PathVariable Long id){
        labService.deleteById(id);
    }
}
