package sk.soukupandrej.cards.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.soukupandrej.cards.config.CardServiceConfig;
import sk.soukupandrej.cards.model.Cards;
import sk.soukupandrej.cards.model.Customer;
import sk.soukupandrej.cards.model.Properties;
import sk.soukupandrej.cards.repository.CardsRepository;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;
    @Autowired
    private CardServiceConfig cardServiceConfig;

    @PostMapping("/myCards")
    public List<Cards> getCardsDetails(@RequestBody Customer customer){

        return cardsRepository.findByCustomerId(customer.getCustomerId());
    }

    @GetMapping("cards/properties")
    public String getCardsProperties() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(cardServiceConfig.getMsg(), cardServiceConfig.getBuildVersion(),
                cardServiceConfig.getMailDetails(), cardServiceConfig.getActiveBranches());
        return objectWriter.writeValueAsString(properties);
    }
}
