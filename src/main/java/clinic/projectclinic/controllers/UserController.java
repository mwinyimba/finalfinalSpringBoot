package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Patient;
import clinic.projectclinic.models.User;
import clinic.projectclinic.services.PatientService;
import clinic.projectclinic.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/")
    public List<User> getAll(){
        return userService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id){
        return userService.findById(id);
    }
    @PutMapping("/{id}")
    public  User updateUser(@RequestBody User user , @PathVariable Long id){
        return  userService.addUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteById(id);
    }
}
