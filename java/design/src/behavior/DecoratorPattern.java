package behavior;

public class DecoratorPattern {

	public class PizzaShop{
		
	}
	
	private interface Pizza{
		public String description();
		public double cost();
	}
	
	private class SmallPizza implements Pizza{

		@Override
		public String description() {
			return "small pizza";
		}

		@Override
		public double cost() {
			return 10;
		}		
	}
	
	private class LargePizza implements Pizza{

		@Override
		public String description() {
			return "large pizza";
		}

		@Override
		public double cost() {
			return 12;
		}		
	}

	private interface IDecorator {}
	
	private class CheeseTopping implements IDecorator, Pizza{
		private final Pizza pizza;
		public CheeseTopping(Pizza pizza){
			this.pizza = pizza;
		}
		
		@Override
		public String description() {
			return this.pizza.description() + " with cheese";
		}

		@Override
		public double cost() {
			return this.pizza.cost()  + 2;
		}
		
	}

	public double execute(){
		Pizza small = new SmallPizza();
		
		return new CheeseTopping(small).cost();
	}
}