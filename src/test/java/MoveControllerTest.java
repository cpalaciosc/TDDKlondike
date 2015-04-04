import static org.junit.Assert.assertEquals;

import org.junit.Test;

import controllers.MoveController;


public class MoveControllerTest {

	private MoveController moveController;
		
	@Test
	public void testMoveDrawToWaste() {
		moveController = new MoveController(2,2);
		moveController.moveFromDrawToWaste();		
		assertEquals(1, moveController.getDraw().getCards().size());
		assertEquals(3, moveController.getWaste().getCards().size());
		
		moveController = new MoveController(1,3);
		moveController.moveFromDrawToWaste();		
		assertEquals(1, moveController.getDraw().getCards().size());
		assertEquals(3, moveController.getWaste().getCards().size());
		
		moveController = new MoveController(0,3);
		moveController.moveFromDrawToWaste();		
		assertEquals(0, moveController.getDraw().getCards().size());
		assertEquals(3, moveController.getWaste().getCards().size());	
		
		moveController = new MoveController(20,0);
		moveController.moveFromDrawToWaste();		
		assertEquals(17, moveController.getDraw().getCards().size());
		assertEquals(3, moveController.getWaste().getCards().size());
		
		moveController = new MoveController(20,2);
		moveController.moveFromDrawToWaste();		
		assertEquals(19, moveController.getDraw().getCards().size());
		assertEquals(3, moveController.getWaste().getCards().size());
	}

}
