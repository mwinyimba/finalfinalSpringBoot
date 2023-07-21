package clinic.projectclinic.controllers;

import clinic.projectclinic.dto.UserRequest;
import clinic.projectclinic.dto.UserResp;
import clinic.projectclinic.models.Patient;
import clinic.projectclinic.models.User;
import clinic.projectclinic.services.PatientService;
import clinic.projectclinic.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PostMapping("/login")
    public ResponseEntity<UserResp> login(@RequestBody UserRequest request){
       User u = userService.getLogin(request.getUsername(), request.getPassword());
//       User us = u;
       if (u != null){
           UserResp resp = new UserResp();
           resp.setFullname(u.getFull_name());
           resp.setId(u.getId());
           resp.setRole(u.getRole_name());
           return  ResponseEntity.ok(resp);
       }else {
           UserResp ur = new UserResp();
           ur.setRole(null);
           ur.setId(500);
           ur.setFullname(null);
           return ResponseEntity.ok(ur);
       }
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
