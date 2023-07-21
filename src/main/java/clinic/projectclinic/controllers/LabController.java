package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Lab;
import clinic.projectclinic.dto.RequestPatient;
import clinic.projectclinic.services.LabService;
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
    public Lab insertLab(@RequestBody RequestPatient request ){
        return labService.insertLab(request);
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
    public  Lab updateLab(@RequestBody RequestPatient request , @PathVariable Long id){
        return  labService.insertLab(request);
    }
    @DeleteMapping("/{id}")
    public void deleteLab(@PathVariable Long id){
        labService.deleteById(id);
    }
}
