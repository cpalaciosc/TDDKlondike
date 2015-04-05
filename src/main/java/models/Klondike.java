package models;

import java.util.ArrayList;
import models.Deck;
import models.Foundations;

public class Klondike {
	
	protected ArrayList<Deck> tableaus = new ArrayList<Deck>();
	protected Foundations foundations = new Foundations();
	protected Deck waste = new Deck();
	protected Deck draw = new Deck();
	
	public static final int NUM_FOUNDATIONS=4;
	public static final int NUM_TABLEAU=7;
	public static final int NUM_DRAW= 24;
	
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
}
