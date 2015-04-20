package design;

import java.util.List;

public class Chess {

	public static class Board{
	
		public enum SquareColor{
			White,
			Black
		};
		
		public enum SquareLetter{
			A, B, C, D, E, F, G, H
		};
		
		public enum SquareNumber{
			One, Two, Three, Four, Five, Six, Seven, Eight
		}
		
		
		public class Square{
			private SquareColor color;
			private SquareLetter letter;
			private SquareNumber number;
			public Square(SquareColor color, SquareLetter letter, SquareNumber number){
				this.color = color;
				this.letter = letter;
				this.number = number;
			}
		}
		
		public List<Square> squares;
	}
	
	public class Piece{
		
		public Piece(IBehavior behavior){
			
		}
	}
	
	public interface IBehavior{
		
	}
	
	public class Queen implements IBehavior{
		
	}
}
