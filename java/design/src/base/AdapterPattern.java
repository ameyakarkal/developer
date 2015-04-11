package base;

public class AdapterPattern {
	
	public static final String Quack = "quack";
	public static final String Gobble = "gobble";
	
	private class Duck{
		public String quack(){
			return Quack;
		}
	}
	
	private class Turkey{
		public String gobble(){
			return Gobble;
		}
	}

	private class DuckQuacker{
		private Duck duck;
		public DuckQuacker(Duck duck){
			this.duck = duck;
		}
		
		public String quackDuck(){
			return this.duck.quack();
		}
	}
	
	private class TurkeyDuckAdapter extends Duck{
		private Turkey turkey;
		public TurkeyDuckAdapter(Turkey turkey){
			this.turkey = turkey;
		}
		
		@Override
		public String quack(){
			return turkey.gobble();
		}
	}
	
	public String explain(){
		
		Turkey turkey = new Turkey();
		
		TurkeyDuckAdapter adapter = new TurkeyDuckAdapter(turkey);
		
		DuckQuacker dq = new DuckQuacker(adapter);
		
		return dq.quackDuck();
	}
}