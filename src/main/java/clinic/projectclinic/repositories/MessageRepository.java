package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message , Long> {
}
