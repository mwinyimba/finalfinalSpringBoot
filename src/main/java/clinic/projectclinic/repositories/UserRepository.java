package clinic.projectclinic.repositories;

import clinic.projectclinic.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Long> {
    @Query("select s from User s where id = ?1")
    User findUserById(Long id);

    @Query("select s from User s where email = ?1 and password = ?2")
    User findUsernameAndPassword(String username, String password);

    List<User> findUserByStatusPatient(String status);
}
