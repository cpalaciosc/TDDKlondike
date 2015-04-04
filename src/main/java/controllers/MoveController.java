package controllers;

import models.CardType;

public class MoveController extends KlondikeController {

	public MoveController(int drawSize, int wasteSize) {
		this.createDraw(drawSize);
		this.createWaste(wasteSize);
	}
	
	public void moveFromDrawToWaste() {
		this.moveFromWasteToDraw();		
		this.waste.assignCards(this.draw.moveCards(this.cardsToMove()));
	}
	
	private void moveFromWasteToDraw(){
		this.draw.addCards(this.waste.moveCards(this.waste.getCards().size()));
	}
	
	private int cardsToMove(){
		return this.draw.getCards().size()>=3 ? 3 : this.draw.getCards().size();
	}

	public boolean moveFromWasteToFoundation(CardType heart) {
		return false;
	}

}
