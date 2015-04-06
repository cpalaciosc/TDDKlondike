package models;


import java.util.ArrayList;
import java.util.List;

public abstract class DeckPile {
	private List<Deck> decks = new ArrayList<Deck>();

	public List<Deck> getDecks() {
		return decks;
	}
	
	public Integer getSize(){
		return this.decks.size();
	}
	
	public int getDeckSize(Integer deck){
		return this.decks.get(deck).getSize();
	}
	
	public boolean isTopCardVisibleFromDeck(Integer deck){
		return this.decks.get(deck).isTopCardVisible();
	}
	
	public boolean areCardsInvisible(Integer deck){	
		for(int j=0;j<decks.get(deck).getSize()-1;j++){
			if(!decks.get(deck).isCardVisible(j))
				return true;
		}
		return false;
	}
}
