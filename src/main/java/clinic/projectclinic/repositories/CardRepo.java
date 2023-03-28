package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepo extends JpaRepository<Card ,Long> {
}
