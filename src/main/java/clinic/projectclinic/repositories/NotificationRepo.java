package clinic.projectclinic.repositories;

import clinic.projectclinic.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<Notification,Long> {
}
