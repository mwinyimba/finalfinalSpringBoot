package clinic.projectclinic.services;

import clinic.projectclinic.dto.RequestMessage;
import clinic.projectclinic.models.Lab;
import clinic.projectclinic.models.Message;
import clinic.projectclinic.models.User;
import clinic.projectclinic.repositories.LabRepository;
import clinic.projectclinic.repositories.MessageRepository;
import clinic.projectclinic.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LabRepository labRepository;
    public Message insertMessage(RequestMessage mes) {
        User l = userRepository.findUserById(mes.getPatientId());

        Message m = new Message();
        m.setMessage(mes.getMessage());
        m.setRespSms(mes.getRespSms());
        m.setStatusPnotRead("Waiting");
        m.setStatusDread("NotRead");
        m.setFrom(l);
        return messageRepository.save(m);
    }

    public List<Message> getAll(Message message) {
        return messageRepository.findAll();
    }

    public Optional<Message> getById(Long id) {
        return messageRepository.findById(id);
    }



}
