package models;

import java.util.ArrayList;
import java.util.List;

public class Foundations {
	private List<Deck> decks = new ArrayList<Deck>();

	public List<Deck> getDecks() {
		return decks;
	}
	
	public Deck getFoundation(CardType type){
		System.out.println("El card Type "+type);
		System.out.println("Size del deck "+this.getDecks().size());
		return this.getDecks().get(type.getIntegerType());
	}

	public boolean moveCard(CardType cardType, Card cardToMove) {
		if(cardType == cardToMove.getType()){
			Card topCard = this.getFoundation(cardType).getTopCard();
			System.out.println("TopCard "+topCard);
			if(topCard!=null){
				if(topCard.getValue()==cardToMove.getValue()+1){
					this.getFoundation(cardType).addCard(cardToMove);
					return true;
				}
			}
			else{
				if(cardToMove.getValue()==1){
					System.out.println("Top card Vacio");
					this.getFoundation(cardType).addCard(cardToMove);
					return true;
				}
			}
		}
		return false;
	}	
}
