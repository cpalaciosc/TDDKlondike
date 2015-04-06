package controllers;

import models.Card;
import models.Deck;
import models.Foundations;
import models.Klondike;
import models.Tableaus;

public class KlondikeController {
	
	private Klondike klondike = new Klondike();
	
	public Klondike getKlondike() {
		return klondike;
	}

	public void setKlondike(Klondike klondike) {
		this.klondike = klondike;
	}

	protected void createDraw(int drawSize) {
		for (int i = 0; i < drawSize; i++) {
			klondike.getDraw().getCards().add(new Card(false));
		}
	}
	
	protected void createWaste(int wasteSize) {
		for (int i = 0; i < wasteSize; i++) {
			klondike.getWaste().getCards().add(new Card(false));
		}
	}
	
	protected Deck getWaste(){
		return this.klondike.getWaste();
	}
	
	protected Deck getDraw(){
		return this.klondike.getDraw();
	}
	
	protected Foundations getFoundations(){
		return this.klondike.getFoundations();
	}
	
	protected Tableaus getTableaus(){
		return this.klondike.getTableaus();
	}
}
