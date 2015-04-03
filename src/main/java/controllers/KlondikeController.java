package controllers;

import java.util.ArrayList;

import models.Card;

public class KlondikeController {
	
	protected ArrayList<ArrayList<Card>> tableaus = new ArrayList<ArrayList<Card>>();
	protected ArrayList<ArrayList<Card>> foundations = new ArrayList<ArrayList<Card>>();
	protected ArrayList<Card> waste = new ArrayList<Card>();
	protected ArrayList<Card> deck = new ArrayList<Card>();
	
	public ArrayList<ArrayList<Card>> getTableaus() {
		return this.tableaus;
	}

	public ArrayList<ArrayList<Card>> getFoundations() {
		return this.foundations;
	}

	public ArrayList<Card> getWaste() {
		return this.waste;
	}

	public ArrayList<Card> getDeck() {
		return this.deck;
	}
}
