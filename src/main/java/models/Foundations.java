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
		boolean equalType = cardType == cardToMove.getType();
		if(equalType){
			return addCardToFoundation(cardType, cardToMove);
		}
		return equalType;
	}	
	
	private boolean addCardToFoundation(CardType cardType, Card cardToMove){
		Card topCard = this.getFoundation(cardType).getTopCard();
		boolean conditionalCard = false;
		
		if(topCard!=null)
			conditionalCard = topCard.getValue()==cardToMove.getValue()-1;
		else
			conditionalCard = cardToMove.getValue()==1;
		
		if(conditionalCard)
			this.getFoundation(cardType).addCard(cardToMove);
		
		return conditionalCard;
	}

	
	public void generateFoundations(CardType type, Integer numberCard){
		this.getFoundation(type).clearDeck();
		for(int i=0;i<numberCard;i++){		
			boolean visible = i==numberCard-1 ? true : false;
			this.getFoundation(type).addCard(new Card(i,type,visible));
		}
	}
}
