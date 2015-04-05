package models;

public class Card {
	
	private boolean visible;
	private CardType type;
	private Integer value;
	
	public Card(boolean visible){
		this.visible=visible;
	}
	
	public Card(int value, CardType type, boolean visible) {
		this.value=value;
		this.type=type;
		this.visible=visible;
	}

	public boolean isVisible() {
		return this.visible;
	}

	public CardType getType() {
		return this.type;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return "Card [visible=" + visible + ", type=" + type + ", value="
				+ value + "]";
	}
}
