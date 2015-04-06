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

	public Card getTopCard() {
		if(this.getCards().isEmpty())
			return null;
		return this.getCards().get(this.getCards().size()-1);
	}

	public void addCard(Card card) {
		this.getCards().add(card);
	}

	public void removeTopCard() {
		this.getCards().remove(this.getTopCard());
	}
	
	public void clearDeck(){
		this.getCards().clear();
	}
	
	public int getSize(){
		return this.getCards().size();
	}

	public void setTopCard(Card card) {
		this.getCards().set(this.getSize()-1, card);
	}
		
}
