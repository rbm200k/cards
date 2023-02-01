package com.m200.repos;

import com.m200.models.Cards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepo extends CrudRepository<Cards,Integer> {
    Cards findByCustomerId(int customerId);
}
