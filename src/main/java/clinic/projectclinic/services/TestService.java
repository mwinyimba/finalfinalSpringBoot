package clinic.projectclinic.services;

import clinic.projectclinic.models.Test;
import clinic.projectclinic.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public Test addaTest(Test test) {
        return testRepository.save(test);
    }

    public List<Test> getAll() {
        return testRepository.findAll();
    }

    public Optional<Test> findById(Long id) {
        return testRepository.findById(id);
    }

    public void deleteById(Long id) {
        testRepository.deleteById(id);
    }
}
