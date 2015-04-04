import org.junit.Before;
import org.junit.Test;


public class MoveControllerTest {

	private MoveController moveController;
	
	@Before
	public void before(){
		moveController = new MoveController(1,2);
	}
	
	@Test
	public void testMoveDrawToWaste() {
		moveController.moveFromDrawToWaste();
	}

}
