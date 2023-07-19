package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Message;
import clinic.projectclinic.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(name = "api/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @PostMapping("/")
    public Message insertMessage(@RequestBody Message message){
        return  messageService.insertMessage(message);
    }
    @GetMapping("/")
    public List<Message> getAll(@RequestBody Message message){
        return messageService.getAll(message);
    }

    @GetMapping("/{id}")
    public Optional<Message> getById(@PathVariable Long id){
        return messageService.getById(id);
    }
}
