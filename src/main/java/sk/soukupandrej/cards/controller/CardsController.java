package sk.soukupandrej.cards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.soukupandrej.cards.model.Cards;
import sk.soukupandrej.cards.model.Customer;
import sk.soukupandrej.cards.repository.CardsRepository;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Cards> getCardsDetails(@RequestBody Customer customer){

        return cardsRepository.findByCustomerId(customer.getCustomerId());
    }
}
