package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Patient;
import clinic.projectclinic.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @PostMapping("/")
    public Patient addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }
    @GetMapping("/")
    public List<Patient> getAll(){
        return patientService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Patient>getById(@PathVariable Long id){
        return patientService.findById(id);
    }
    @PutMapping("/{id}")
    public  Patient updatePatient(@RequestBody Patient patient , @PathVariable Long id){
        return  patientService.addPatient(patient);
    }
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        patientService.deleteById(id);
    }
}
