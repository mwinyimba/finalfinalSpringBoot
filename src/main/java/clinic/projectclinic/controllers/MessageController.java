package clinic.projectclinic.controllers;

import clinic.projectclinic.dto.RequestMessage;
import clinic.projectclinic.models.Message;
import clinic.projectclinic.models.Patient;
import clinic.projectclinic.repositories.MessageRepository;
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
    @Autowired
    private MessageRepository messageRepository;
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

    @PutMapping("/message/{id}")
    public Message updateMessage(@RequestBody RequestMessage mes , @PathVariable Long id){
        Message m = messageRepository.findMessageById(id);
        m.setRespSms(m.getRespSms());
        m.setMessage(m.getMessage());
        m.setStatusPnotRead("NotRead");
        m.setStatusDread("Read");

        return  messageService.insertMessage(mes);}
}
