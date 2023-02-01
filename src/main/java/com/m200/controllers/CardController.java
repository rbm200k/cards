package com.m200.controllers;

import com.m200.models.Cards;
import com.m200.models.Customer;
import com.m200.services.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/m200")
public class CardController {

    @Autowired
    private CardsService cardsService;

    @PostMapping("/cccc")
    public Cards createCustomerCC(@RequestBody Customer cust){
    return cardsService.save(cust);
    }

    @GetMapping("/getccc")
    public Cards  getCustomerCards(@RequestBody Customer cust){
        return cardsService.getCards(cust);
    }

}
