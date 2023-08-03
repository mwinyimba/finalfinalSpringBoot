package clinic.projectclinic.controllers;

import clinic.projectclinic.dto.RequestMessage;
import clinic.projectclinic.models.Message;
import clinic.projectclinic.models.User;
import clinic.projectclinic.repositories.UserRepository;
import clinic.projectclinic.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/")
    public Message insertMessage(@RequestBody RequestMessage mes){

        return  messageService.insertMessage(mes);
    }


    @GetMapping("/")
    public List<Message> getAll(@RequestBody Message message){
        return messageService.getAll(message);
    }

    @GetMapping("/{id}")
    public Optional<Message> getById(@PathVariable Long id){
        return messageService.getById(id);
    }
    @GetMapping("/message/{id}")
    public List<Message> getAllById(@PathVariable Long id){
        return messageService.getAllById(id);
    }

    @PutMapping("/message/{id}")
    public Message update(@RequestBody RequestMessage mes , @PathVariable Long id){

        return  messageService.insertMessage(mes);}
}
