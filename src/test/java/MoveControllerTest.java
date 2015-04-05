import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import models.Card;
import models.CardType;

import org.junit.Before;
import org.junit.Test;

import controllers.MoveController;
import controllers.StartController;


public class MoveControllerTest {

	private MoveController moveController;
	private StartController startController = new StartController();
	
	@Before
	public void before(){
		startController.start();
	}
		
	@Test
	public void testMoveDrawToWaste() {
		moveController = new MoveController(2,2);
		moveController.moveFromDrawToWaste();		
		assertEquals(1, moveController.getKlondike().getDraw().getCards().size());
		assertEquals(3, moveController.getKlondike().getWaste().getCards().size());
		
		moveController = new MoveController(1,3);
		moveController.moveFromDrawToWaste();		
		assertEquals(1, moveController.getKlondike().getDraw().getCards().size());
		assertEquals(3, moveController.getKlondike().getWaste().getCards().size());
		
		moveController = new MoveController(0,3);
		moveController.moveFromDrawToWaste();		
		assertEquals(0, moveController.getKlondike().getDraw().getCards().size());
		assertEquals(3, moveController.getKlondike().getWaste().getCards().size());	
		
		moveController = new MoveController(20,0);
		moveController.moveFromDrawToWaste();		
		assertEquals(17, moveController.getKlondike().getDraw().getCards().size());
		assertEquals(3, moveController.getKlondike().getWaste().getCards().size());
		
		moveController = new MoveController(20,2);
		moveController.moveFromDrawToWaste();		
		assertEquals(19, moveController.getKlondike().getDraw().getCards().size());
		assertEquals(3, moveController.getKlondike().getWaste().getCards().size());
	}
	
	@Test
	public void testMoveWasteToFoundation(){
		startController.getKlondike().getFoundations().generateFoundations(CardType.SPADE, 5);
		moveController = new MoveController(startController.getKlondike(),0,0);
		Card card1 = new Card(10,CardType.CLUB,true);
		Card card2 = new Card(10,CardType.HEART,true);
		Card card3 = new Card(5,CardType.SPADE,true);
		List<Card> cards = new ArrayList<Card>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		this.moveController.getKlondike().getWaste().assignCards(cards);
		
		assertFalse(this.moveController.moveFromWasteToFoundation(CardType.HEART));
		assertTrue(this.moveController.moveFromWasteToFoundation(CardType.SPADE));
		
		startController.getKlondike().getFoundations().generateFoundations(CardType.HEART, 0);
		moveController = new MoveController(startController.getKlondike(),0,0);
		card1 = new Card(10,CardType.CLUB,true);
		card2 = new Card(10,CardType.HEART,true);
		card3 = new Card(1,CardType.HEART,true);
		cards = new ArrayList<Card>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		this.moveController.getKlondike().getWaste().assignCards(cards);
		
		assertFalse(this.moveController.moveFromWasteToFoundation(CardType.DIAMONDS));
		assertTrue(this.moveController.moveFromWasteToFoundation(CardType.HEART));
	}

}
