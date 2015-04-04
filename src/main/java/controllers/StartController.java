package controllers;

import models.Card;
import models.Deck;

public class StartController extends KlondikeController {

	public void start() {
		this.createTableau();
		this.createFoundations();
		this.createDraw();
	}

	private void createTableau() {
		for (int i = 0; i < this.NUM_TABLEAU; i++) {
			Deck tableau = new Deck();
			for (int j = 0; j <= i; j++) {
				if (j == i)
					tableau.getCards().add(new Card(true));
				else
					tableau.getCards().add(new Card(false));
			}
			this.tableaus.add(tableau);
		}
	}

	private void createFoundations() {
		for (int i = 0; i < this.NUM_FOUNDATIONS; i++) {
			foundations.add(new Deck());
		}
	}

	private void createDraw() {
		for (int i = 0; i < this.NUM_DRAW; i++) {
			draw.getCards().add(new Card(false));
		}
	}
}
