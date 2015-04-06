package models;

import models.Deck;
import models.Foundations;

public class Klondike {
	
	protected Tableaus tableaus = new Tableaus();
	protected Foundations foundations = new Foundations();
	protected Deck waste = new Deck();
	protected Deck draw = new Deck();
	
	public static final int NUM_FOUNDATIONS=4;
	public static final int NUM_TABLEAU=7;
	public static final int NUM_DRAW= 24;
	
	public Tableaus getTableaus() {
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
}
