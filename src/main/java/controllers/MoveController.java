package controllers;

import models.Card;
import models.CardType;
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

	public boolean moveFromWasteToFoundation(CardType cardType) {
		Card cardToMove = getWaste().getTopCard();
		boolean successMove = getFoundations().moveCard(cardType, cardToMove);
		if(successMove)
			getWaste().removeTopCard();
		return successMove;
	}

}
