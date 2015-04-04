import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import controllers.MoveController;


public class MoveControllerTest {

	private MoveController moveController;
	
	@Before
	public void before(){
		moveController = new MoveController(20);
	}
	
	@Test
	public void testMoveDrawToWaste() {
		moveController.moveFromDrawToWaste();

		int drawLength = moveController.getDraw().getCards().size();
		
		if(drawLength>3){
			moveController.moveFromDrawToWaste();
			assertEquals(moveController.getDraw().getCards().size(), drawLength-3);
		}
		else if(drawLength==2){
			moveController.moveFromDrawToWaste();
			assertEquals(moveController.getDraw().getCards().size(), drawLength-2);
		}
		else if(drawLength==1){
			moveController.moveFromDrawToWaste();
			assertEquals(moveController.getDraw().getCards().size(), drawLength-1);
		}
	}

}
