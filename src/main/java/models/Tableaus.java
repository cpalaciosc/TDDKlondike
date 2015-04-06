package models;

import java.util.ArrayList;
import java.util.List;

public class Tableaus {
	private List<Deck> decks = new ArrayList<Deck>();

	public List<Deck> getDecks() {
		return decks;
	}
	
	public Deck getTableaus(Integer position){
		return this.getDecks().get(position);
	}
	
	public void assignTopCardTableau(Integer position, Card card){
		this.getTableaus(position).setTopCard(card);
	}
}
