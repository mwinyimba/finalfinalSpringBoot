package clinic.projectclinic.services;

import clinic.projectclinic.dto.RequestMessage;
import clinic.projectclinic.models.Lab;
import clinic.projectclinic.models.Message;
import clinic.projectclinic.repositories.LabRepository;
import clinic.projectclinic.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private LabRepository labRepository;
    public Message insertMessage(RequestMessage mes) {
        Lab l = labRepository.findLabById(mes.getPatientId());

        Message m = new Message();
        m.setMessage(mes.getSms());
        m.setRespSms(mes.getRespSms());
        m.setStatus(mes.getStatus());
//        m.setFrom();
        return messageRepository.save(m);
    }

    public List<Message> getAll(Message message) {
        return messageRepository.findAll();
    }

    public Optional<Message> getById(Long id) {
        return messageRepository.findById(id);
    }



}
