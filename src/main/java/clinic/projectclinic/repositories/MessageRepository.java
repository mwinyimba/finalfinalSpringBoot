package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Lab;
import clinic.projectclinic.models.Message;
import clinic.projectclinic.models.Treatment;
import clinic.projectclinic.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message , Long> {
     @Query("select t from Message t  where t.smsFrom = ?1")
     List<Message> findByMessageByPatientId(User u);

     @Query("select l from Message l where userId = ?1")
     Message findMessageById(Long id);








}
