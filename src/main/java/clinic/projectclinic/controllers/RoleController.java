package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Role;
import clinic.projectclinic.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @PostMapping("/")
    public Role addRole(@RequestBody Role role){
        return roleService.addRole(role);
    }
    @GetMapping("/")
    public List<Role> getAll(){
        return roleService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Role> getById(@PathVariable Long id){
        return roleService.findById(id);
    }
    @PutMapping("/{id}")
    public Role updateRole(@RequestBody Role role , @PathVariable Long id){
        return  roleService.addRole(role);
    }
    @DeleteMapping("/{id}")
    public void  deleteRole(@PathVariable Long id){
        roleService.deleteById(id);
    }

}
