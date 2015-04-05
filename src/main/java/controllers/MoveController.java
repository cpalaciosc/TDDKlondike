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
		this.getKlondike().getWaste().assignCards(this.getKlondike().getDraw().moveCards(this.cardsToMove()));
	}
	
	private void moveFromWasteToDraw(){
		this.getKlondike().getDraw().addCards(this.getKlondike().getWaste().moveCards(this.getKlondike().getWaste().getCards().size()));
	}
	
	private int cardsToMove(){
		return this.getKlondike().getDraw().getCards().size()>=3 ? 3 : this.getKlondike().getDraw().getCards().size();
	}

	public boolean moveFromWasteToFoundation(CardType cardType) {
		Card cardToMove = this.getKlondike().getWaste().getTopCard();
		System.out.println("Card to move"+ cardToMove);
		boolean successMove = this.getKlondike().getFoundations().moveCard(cardType, cardToMove);
		System.out.println("SuccessMove "+successMove);
		if(successMove)
			this.getKlondike().getWaste().removeTopCard();
		return successMove;
	}

}
