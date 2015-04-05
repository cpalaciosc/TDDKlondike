package models;

import java.util.ArrayList;
import java.util.List;

public class Foundations {
	private List<Deck> decks = new ArrayList<Deck>();

	public List<Deck> getDecks() {
		return decks;
	}
	
	public Deck getFoundation(CardType type){
		return this.getDecks().get(type.getIntegerType());
	}

	public boolean moveCard(CardType cardType, Card cardToMove) {
		if(cardType == cardToMove.getType()){
			Card topCard = this.getFoundation(cardType).getTopCard();
			if(topCard!=null){
				if(topCard.getValue()==cardToMove.getValue()-1){
					this.getFoundation(cardType).addCard(cardToMove);
					return true;
				}
			}
			else{
				if(cardToMove.getValue()==1){
					this.getFoundation(cardType).addCard(cardToMove);
					return true;
				}
			}
		}
		return false;
	}	
	
	public void generateFoundations(CardType type, Integer numberCard){
		this.getFoundation(type).clearDeck();
		for(int i=0;i<numberCard;i++){		
			boolean visible = i==numberCard-1 ? true : false;
			this.getFoundation(type).addCard(new Card(i,type,visible));
		}
	}
}
