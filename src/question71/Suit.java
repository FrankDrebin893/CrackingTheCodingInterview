package question71;

public enum Suit {
	Club (0), Diamond (1), Spade (2), Heart (3); 
	private int value;
	private Suit(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static Suit getSuitFromValue(int value){
		if(Suit.Club.getValue() == value) {
			return Suit.Club;
		} else if (Suit.Diamond.getValue() == value) {
			return Suit.Diamond;
		} else if (Suit.Spade.getValue() == value) {
			return Suit.Spade;
		} else if (Suit.Heart.getValue() == value) {
			return Suit.Heart;
		}
		return null;
	}

}
