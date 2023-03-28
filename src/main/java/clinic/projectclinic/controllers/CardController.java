package clinic.projectclinic.controllers;

import clinic.projectclinic.models.Card;
import clinic.projectclinic.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/card")
public class CardController {
    @Autowired
    private CardService cardService;
    @PostMapping("/")
    public Card addCard(@RequestBody Card card){
        return cardService.addCard(card);
    }
    @GetMapping("/")
    public List<Card> getAll(){
        return  cardService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Card> getById(@PathVariable Long id){
        return cardService.findById(id);
    }
    @PutMapping("/{id}")
    public Card updateCard(@RequestBody Card card , @PathVariable Long id){
        return  cardService.addCard(card);
    }
    @DeleteMapping("/{id}")
    public void  deleteCard(@PathVariable Long id){
        cardService.deleteById(id);
    }



}
