import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import models.Card;
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
		ArrayList<ArrayList<Card>> tableaus = startController.getTableaus();
		for(int i=0;i<tableaus.size();i++){
			int lastCard = tableaus.get(i).size()-1;
			assertTrue(tableaus.get(i).get(lastCard).isVisible());
			if(i>0){
				for(int j=0;j<tableaus.get(i).size()-1;j++){
					assertFalse(tableaus.get(i).get(j).isVisible());
				}
			}
		}
		
		//Test foundations
		ArrayList<ArrayList<Card>> foundations = startController.getFoundations();
		for(int i=0;i<foundations.size();i++){
			assertEquals(0, foundations.get(i).size());
		}
	}
	

}
