package sk.soukupandrej.cards.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.soukupandrej.cards.model.Cards;

import java.util.List;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {

    List<Cards> findByCustomerId(int customerId);
}
