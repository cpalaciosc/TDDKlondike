package controllers;

public class MoveController extends KlondikeController {

	public MoveController(int drawSize) {
		this.createDraw(drawSize);
	}

	public void moveFromDrawToWaste() {
		if(this.draw.getCards().size()>=3){
			this.waste.assignCards(this.draw.moveCards(3));
		}
		else if(this.draw.getCards().size()>=2){
			this.waste.assignCards(this.draw.moveCards(2));
		}
		else if(this.draw.getCards().size()>=1){
			this.waste.assignCards(this.draw.moveCards(1));
		}
	}

}
