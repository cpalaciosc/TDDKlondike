package controllers;

import java.util.ArrayList;
import models.Deck;

public class KlondikeController {
	
	protected ArrayList<Deck> tableaus = new ArrayList<Deck>();
	protected ArrayList<Deck> foundations = new ArrayList<Deck>();
	protected Deck waste = new Deck();
	protected Deck draw = new Deck();
	
	public ArrayList<Deck> getTableaus() {
		return this.tableaus;
	}

	public ArrayList<Deck> getFoundations() {
		return this.foundations;
	}

	public Deck getWaste() {
		return this.waste;
	}

	public Deck getDraw() {
		return this.draw;
	}
}
