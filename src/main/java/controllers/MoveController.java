package controllers;

public class MoveController extends KlondikeController {

	public MoveController(int drawSize, int wasteSize) {
		this.createDraw(drawSize);
		this.createWaste(wasteSize);
	}
	
	public void moveFromDrawToWaste() {
		this.moveFromWasteToDraw();
		if(this.draw.getCards().size()>=3){
			this.waste.assignCards(this.draw.moveCards(3));
		}
		else if(this.draw.getCards().size()==2){
			this.waste.assignCards(this.draw.moveCards(2));
		}
		else if(this.draw.getCards().size()==1){
			this.waste.assignCards(this.draw.moveCards(1));
		}
	}
	
	private void moveFromWasteToDraw(){
		this.draw.addCards(this.waste.moveCards(this.waste.getCards().size()));
	}

}
