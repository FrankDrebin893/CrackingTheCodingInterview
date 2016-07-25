package question71;

import java.util.ArrayList;
import java.util.Collections;

public class Deck <T extends Card>{
	private ArrayList<T> cards;
	private int dealtIndex = 0;
	
	public void setDeckOfCards(ArrayList<T> deckOfCards){
		this.cards = deckOfCards;
	};
	
	public void shuffle(){
		Collections.shuffle(this.cards);
	};
}
