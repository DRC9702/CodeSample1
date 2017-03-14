
public class Card {
	private int value;
	private char suit;
	
	public Card(int value, char suit){
		if(value<0 || value >13)
			throw new RuntimeException("Invalid value - outside range[0-13]:" + value);	
		this.value=value;
		if(suit!='S' && suit!='H' && suit!='C' && suit!='D')
			throw new RuntimeException("Invalid suit - Must be in set{S,H,C,D}:" + suit);
		this.suit=suit;
	}
	
	
	public int getValue(){
		return value;
	}
	
	public char getSuit(){
		return suit;
	}
	
	public String getSuitName(){
		switch(suit){
		case 'S': return "Spades";
		case 'H': return "Hearts";
		case 'D': return "Diamonds";
		case 'C': return "Clubs";
		default: throw new RuntimeException("Invalid suit:"+suit);
		}
	}
	
	public String getValueName(){
		if(value<0 || value>13)
			throw new RuntimeException("Invalid value:"+value);
		if(value==1 || value==11 || value==12 || value==13){
			switch(value){
			case 1: return "Ace";
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			}
		}
		return ""+value;
	}
	
	public String toString(){
		String suitName = getSuitName();
		String valueName = getValueName();
		return (valueName + " of " + suitName);
	}
}
