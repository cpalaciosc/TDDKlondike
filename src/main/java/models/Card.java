package models;

public class Card {
	
	private boolean visible;
	
	public Card(boolean visible){
		this.visible=visible;
	}
	
	public Card(int i, CardType spade, boolean b) {

	}

	public boolean isVisible() {
		return this.visible;
	}

}
