package design;

public class Card {

	public enum Suit{
		Hearts,
		Diamonds,
		Clubs,
		Spades
	}
	
	public enum CardValue{
		Ace(1),
		Two(2),
		Three(3),
		Four(4),
		Five(5),
		Six(6),
		Seven(7),
		Eight(8),
		Nine(9),
		Ten(10),
		Jack(11),
		Queen(12),
		King(13);
		
		private int value;
		
		CardValue(int value){
			this.value = value;
		}
		
		public int getValue(){
			return value;
		}
	}

	private final Suit suit;
	private final CardValue value;
	public Card(Suit suit, CardValue value){
		this.suit = suit;
		this.value = value;
	}
}