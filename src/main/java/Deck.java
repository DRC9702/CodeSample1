import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Deck {
	private Stack<Card> cards = new Stack<Card>();
	private Random random = new Random();
	
	public Deck(){
		createDeck();
		shuffle();
	}
	
	public Deck(long seed){
		setSeed(seed);
		createDeck();
		shuffle();
	}
	
	
	public void createDeck(){
		char[] suits = {'S','H','C','D'};
		for(int i=0; i<4; i++){
			for(int j=1; j<=13; j++){
				int value = j;
				char suit = suits[i];
				cards.push(new Card(value,suit));
			}
		}
	}
	
	public void shuffle(){
		Collections.shuffle(cards, random);
	}
	
	public Card dealOneCard(){
		if(cards.isEmpty()){
			System.out.println("Deck is empty.");
			return null;
		}
		else{
			return cards.pop();
		}
	}
	
	public int getSize(){
		return cards.size();
	}
	
	public void setSeed(long seed) {
		random.setSeed(seed);
	}
}
