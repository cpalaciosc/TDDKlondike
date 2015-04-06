package controllers;

import models.Card;
import models.Deck;
import models.Klondike;

public class StartController extends KlondikeController {

	public void start() {
		this.createTableau();
		this.createFoundations();
		this.createDraw();
	}

	private void createTableau() {
		for (int i = 0; i < Klondike.NUM_TABLEAU; i++) {
			Deck tableau = new Deck();
			for (int j = 0; j <= i; j++) {
				if (j == i)
					tableau.getCards().add(new Card(true));
				else
					tableau.getCards().add(new Card(false));
			}
			getTableaus().getDecks().add(tableau);
		}
	}

	private void createFoundations() {
		for (int i = 0; i < Klondike.NUM_FOUNDATIONS; i++) {
			getFoundations().getDecks().add(new Deck());
		}
	}

	private void createDraw() {
		for (int i = 0; i < Klondike.NUM_DRAW; i++) {
			getDraw().getCards().add(new Card(false));
		}
	}
}
