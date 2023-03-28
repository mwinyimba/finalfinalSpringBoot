package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Doctor;
import clinic.projectclinic.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
     @PostMapping("/")
    public Doctor addDoctor(@RequestBody Doctor d){
         return doctorService.addDoctor(d);

     }
     @GetMapping("/")
    public List<Doctor>getAll(){
         return doctorService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Doctor> getById(@PathVariable Long  id){
         return doctorService.getById(id);
    }

    @PutMapping
    public Doctor updateDoctor(@RequestBody Doctor d , @PathVariable Long id){
         return doctorService.addDoctor(d);
    }
    @DeleteMapping("/{id}")
    public  void deleteDoctor(@PathVariable Long id){
         doctorService.deleteById(id);
    }


}
