import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
				
		for(int i=0;i<tableaus.getDecks().size();i++){
			assertEquals(i+1,tableaus.getDecks().get(i).getCards().size());
			int lastCard = tableaus.getDecks().get(i).getCards().size()-1;
			assertTrue(tableaus.getDecks().get(i).getCards().get(lastCard).isVisible());
			if(i>0){
				for(int j=0;j<tableaus.getDecks().get(i).getCards().size()-1;j++){
					assertFalse(tableaus.getDecks().get(i).getCards().get(j).isVisible());
				}
			}
		}
		
		//Test foundations
		Foundations foundations = startController.getKlondike().getFoundations();
		for(int i=0;i<foundations.getDecks().size();i++){
			assertEquals(0, foundations.getDecks().get(i).getCards().size());
		}
		
		//Test waste
		Deck waste = startController.getKlondike().getWaste();
		assertEquals(0, waste.getCards().size());
		
		//Test draw
		Deck draw = startController.getKlondike().getDraw();
		assertEquals(24, draw.getCards().size());
	}
	

}
