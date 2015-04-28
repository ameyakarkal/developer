package recursion;

public class Currency {

	public enum Denomination{
		Quater(25),
		Dime(10),
		Nickle(5),
		Cent(1);
		
		
		private int value;
		Denomination(int value){
			this.value = value;
		}
		public int getValue(){
			return this.value;
		}
	}
	
	public static int makeChangeFor(int amount, Denomination current){
		
		Denomination next = nextDenomination(current);
		
		int ways = 0;
		
		
		
		for(int i = 0; i * current.getValue() <= amount; i++){
			
			int remainder = amount - (i * current.getValue());
			
			ways = ways + makeChangeFor(remainder, next);
		
		}
		
		return ways;
	}
	
	public static Denomination nextDenomination(Denomination d){
		switch(d){
			case Quater: return Denomination.Dime;
			case Dime : return Denomination.Nickle;
			default: return Denomination.Cent;
		}
	}
}
