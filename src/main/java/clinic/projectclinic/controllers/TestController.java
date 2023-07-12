package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Patient;
import clinic.projectclinic.models.Test;
import clinic.projectclinic.services.PatientService;
import clinic.projectclinic.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/test")
public class TestController {
    @Autowired
    private TestService testService;
    @PostMapping("/test")
    public Test addTest(@RequestBody Test test){
        return testService.addaTest(test);
    }
    @GetMapping("/test")
    public List<Test> getAll(){
        return testService.getAll();
    }
    @GetMapping("/test/{id}")
    public Optional<Test> getById(@PathVariable Long id){
        return testService.findById(id);
    }
    @PutMapping("/test/{id}")
    public  Test updateTest(@RequestBody Test test , @PathVariable Long id){
        return  testService.addaTest(test);
    }
    @DeleteMapping("/test/{id}")
    public void deleteTest(@PathVariable Long id){
        testService.deleteById(id);
    }
}
