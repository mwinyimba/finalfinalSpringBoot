package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Login;
import clinic.projectclinic.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/")
    public Login addLogin(@RequestBody Login login){
        return loginService.save(login);
    }
    @GetMapping("/")
    public List<Login> getAll(){
        return loginService.getALl();
    }
    @GetMapping("{id}")
    public Optional<Login> getById(@PathVariable Long id){
         return loginService.getById(id);
    }
   @DeleteMapping("{id}")
    public  void deleteLogin(@PathVariable Long id){
        loginService.deleteById(id);
   }
   @PutMapping("{id}")
    public Login updateLogin(@PathVariable Long id , @RequestBody Login login){
        return loginService.save(login);
   }
}
