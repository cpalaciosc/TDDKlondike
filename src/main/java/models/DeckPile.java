package models;

import java.util.ArrayList;
import java.util.List;

public abstract class DeckPile {
	private List<Deck> decks = new ArrayList<Deck>();

	public List<Deck> getDecks() {
		return decks;
	}
}
