package controllers;

import models.Card;
import models.CardType;
import models.Deck;
import models.Klondike;

public class MoveController extends KlondikeController {
	
	public MoveController(int drawSize, int wasteSize) {
		this.createDraw(drawSize);
		this.createWaste(wasteSize);
	}
	
	public MoveController(Klondike klondike, int drawSize, int wasteSize) {
		this.setKlondike(klondike);
		this.createDraw(drawSize);
		this.createWaste(wasteSize);
	}

	public void moveFromDrawToWaste() {
		this.moveFromWasteToDraw();	
		getWaste().assignCards(getDraw().moveCards(this.cardsToMove()));
	}
	
	private void moveFromWasteToDraw(){
		getDraw().addCards(getWaste().moveCards(getWaste().getSize()));
	}
	
	private int cardsToMove(){
		final int MAX_CARDS = 3;
		return getDraw().getCards().size()>=MAX_CARDS ? MAX_CARDS : getDraw().getSize();
	}

	public boolean moveFromDeckToFoundation(Deck deck, CardType cardType){
		Card cardToMove = deck.getTopCard();
		boolean successMove = getFoundations().moveCard(cardType, cardToMove);
		if(successMove)
			deck.removeTopCard();
		return successMove;
	}
}
