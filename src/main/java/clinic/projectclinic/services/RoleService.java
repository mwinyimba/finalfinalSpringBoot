package clinic.projectclinic.services;

import clinic.projectclinic.models.Role;
import clinic.projectclinic.repositories.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;

    public Role addRole(Role role) {
        return roleRepo.save(role);
    }

    public List<Role> getAll() {
        return roleRepo.findAll();
    }

    public Optional<Role> findById(Long id) {
        return roleRepo.findById(id);
    }

    public void deleteById(Long id) {
        roleRepo.deleteById(id);
    }
}
