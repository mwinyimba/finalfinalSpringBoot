package clinic.projectclinic.services;

import clinic.projectclinic.models.Notification;
import clinic.projectclinic.repositories.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepo notificationRepo;

    public Notification addNotification(Notification n) {
        return  notificationRepo.save(n);
    }

    public List<Notification> getAll() {
        return notificationRepo.findAll();
    }


    public Optional<Notification> findById(Long id) {
        return notificationRepo.findById(id);
    }

    public void deleteById(Long id) {
        notificationRepo.deleteById(id);
    }
}
