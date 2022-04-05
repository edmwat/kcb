package com.edward.kcb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edward.kcb.models.Card;
import com.edward.kcb.repo.CardRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
public class CardsService {
	
	private final CardRepository cardRepo;
	
	public List<Card> getAccountCards(long accountId){
		return cardRepo.findByAccountId(accountId);
	}
	
	public void addNewCard(Card card) {
		this.cardRepo.save(card);		
	}
	
	public void deleteCard(Long cardId) {
		this.cardRepo.deleteById(cardId);
	}
}
