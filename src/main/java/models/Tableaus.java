package models;

public class Tableaus extends DeckPile {
	
	public Deck getTableaus(Integer position){
		return this.getDecks().get(position);
	}
	
	public void assignTopCardTableau(Integer position, Card card){
		this.getTableaus(position).setTopCard(card);
	}
}
