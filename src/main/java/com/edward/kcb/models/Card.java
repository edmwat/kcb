package com.edward.kcb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Card {
	@Id
	private long id;
	private String alias;
	private long accountId;
	private String cardType;
	
	public Card(String alias, long accId, String cardType) {
		this.alias= alias;
		this.accountId = accId;
		this.cardType=cardType;
		
	}
}
