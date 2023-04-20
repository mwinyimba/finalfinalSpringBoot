package clinic.projectclinic.services;

import clinic.projectclinic.models.Login;
import clinic.projectclinic.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public Login save(Login login) {
        return loginRepository.save(login);
    }

    public List<Login> getALl() {
        return  loginRepository.findAll();
    }

    public Optional<Login> getById(Long id) {
        return  loginRepository.findById(id);
    }


    public void deleteById(Long id) {
        loginRepository.deleteById(id);
    }
}
