import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

import models.Deck;
import models.Foundations;
import models.Tableaus;
import controllers.StartController;


public class StartControllerTest {

	StartController startController;
	
	@Before
	public void before(){
		startController = new StartController();
	}
	
	@Test
	public void startGametest() {
		startController.start();
		
		//Test tableau
		Tableaus tableaus = startController.getKlondike().getTableaus();
				
		for(int i=0;i<tableaus.getSize();i++){
			assertEquals(i+1,tableaus.getDeckSize(i));
			assertTrue(tableaus.isLastCardVisibleFromDeck(i));
			if(i>0){
				assertTrue(tableaus.areCardsInvisible(i));
			}
		}
		
		//Test foundations
		Foundations foundations = startController.getKlondike().getFoundations();
		for(int i=0;i<foundations.getSize();i++){
			assertEquals(0, foundations.getDeckSize(i));
		}
		
		//Test waste
		Deck waste = startController.getKlondike().getWaste();
		assertEquals(0, waste.getSize());
		
		//Test draw
		Deck draw = startController.getKlondike().getDraw();
		assertEquals(24, draw.getSize());
	}
	

}
