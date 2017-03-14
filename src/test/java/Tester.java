import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	@Test public void testing53Cards() {
		Deck deck = new Deck();
		
		deck.shuffle();
		for(int i=0; i<52; i++){
			Card card = deck.dealOneCard();
			if(i%4==3)
				System.out.println(card.toString());
			else
				System.out.printf("%-20s",card.toString());
		}
		
		//53rd Call to deadOneCard()
		Card card = deck.dealOneCard();
		assertTrue("No Cards Should Be Dealt",card==null);

	}

}
