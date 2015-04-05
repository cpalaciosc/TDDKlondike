package controllers;

import java.util.ArrayList;

import models.Card;
import models.Deck;
import models.Foundations;

public class KlondikeController {
	
	protected ArrayList<Deck> tableaus = new ArrayList<Deck>();
	protected Foundations foundations = new Foundations();
	protected Deck waste = new Deck();
	protected Deck draw = new Deck();
	
	protected final int NUM_FOUNDATIONS=4;
	protected final int NUM_TABLEAU=7;
	protected final int NUM_DRAW= 24;
	
	public ArrayList<Deck> getTableaus() {
		return this.tableaus;
	}

	public Foundations getFoundations() {
		return this.foundations;
	}

	public Deck getWaste() {
		return this.waste;
	}

	public Deck getDraw() {
		return this.draw;
	}
		
	protected void createDraw(int drawSize) {
		for (int i = 0; i < drawSize; i++) {
			draw.getCards().add(new Card(false));
		}
	}
	
	protected void createWaste(int wasteSize) {
		for (int i = 0; i < wasteSize; i++) {
			waste.getCards().add(new Card(false));
		}
	}
}
