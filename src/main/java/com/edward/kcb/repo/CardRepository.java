package com.edward.kcb.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edward.kcb.models.Card;


public interface CardRepository extends JpaRepository<Card, Long> {

	List<Card> findByAccountId(long accountId);
}
