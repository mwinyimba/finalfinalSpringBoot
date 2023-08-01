package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Lab;
import clinic.projectclinic.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MessageRepository extends JpaRepository<Message , Long> {
     @Query("select s from User s where id = ?1")
     Lab findLabById(Long id);







}
