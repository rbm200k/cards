package com.m200.services;

import com.m200.models.Cards;
import com.m200.models.Customer;
import com.m200.repos.CardsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardsService {
    @Autowired
    private Cards cards;

    @Autowired
    private CardsRepo cardsRepo;

    public Cards save(Customer cust) {
        cards.setCardbalance(50000);
        cards.setCardtype("C");
        cards.setCardlimit(50000);
        cards.setCustomerId(2);
        cards.setCardnumber("15425325632785412");
        return cardsRepo.save(cards);
    }

    public Cards getCards(Customer cust) {
        return cardsRepo.findByCustomerId(cust.getCustomerId());
    }
}
