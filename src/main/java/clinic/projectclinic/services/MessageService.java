package clinic.projectclinic.services;

import clinic.projectclinic.models.Message;
import clinic.projectclinic.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    public Message insertMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> getAll(Message message) {
        return messageRepository.findAll();
    }

    public Optional<Message> getById(Long id) {
        return messageRepository.findById(id);
    }
}
