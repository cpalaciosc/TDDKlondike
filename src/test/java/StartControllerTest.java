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
	}
	

}
