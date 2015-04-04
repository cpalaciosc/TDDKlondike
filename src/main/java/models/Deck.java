package models;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();

	public List<Card> getCards() {
		return cards;
	}
	
	public List<Card> moveCards(int numCards){
		List<Card> temporal = this.getCards().subList(this.getCards().size()-numCards, this.getCards().size());
		this.assignCards(this.getCards().subList(0,this.getCards().size()-numCards));
		return temporal;
	}
	
	public void assignCards(List<Card> cards){
		this.cards = cards;
	}
	
	public void addCards(List<Card> cards){
		this.cards.addAll(cards);
	}
		
}
