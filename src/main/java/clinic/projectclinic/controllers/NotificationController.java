package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Notification;
import clinic.projectclinic.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    @PostMapping("/")
    public Notification addNotification(@RequestBody Notification n){
        return notificationService.addNotification(n);
    }
    @GetMapping("/")
    public List<Notification> getAll(){
        return notificationService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Notification> getById(@PathVariable Long id){
        return notificationService.findById(id);
    }
    @PutMapping("/{id}")
    public Notification updateNotification(@RequestBody Notification n, @PathVariable Long id){
        return notificationService.addNotification(n);
    }
    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Long id){
        notificationService.deleteById(id);
    }
}
