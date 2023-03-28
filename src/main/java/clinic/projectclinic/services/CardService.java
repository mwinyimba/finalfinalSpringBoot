package clinic.projectclinic.services;

import clinic.projectclinic.models.Card;
import clinic.projectclinic.repositories.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {
    @Autowired
    private CardRepo cardRepo;

    public Card addCard(Card card) {
        return cardRepo.save(card);
    }

    public List<Card> getAll() {
        return cardRepo.findAll();
    }

    public Optional<Card> findById(Long id) {
        return cardRepo.findById(id);
    }

    public void deleteById(Long id) {
        cardRepo.deleteById(id);
    }
}
