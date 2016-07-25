package question71;

import java.util.Random;

public abstract class Card {
	public Suit suit;
	public int number;
	
	
	public Card() {
		Random rand = new Random();
		suit = Suit.Club;
		number = rand.nextInt(12) + 1;
	}

}
