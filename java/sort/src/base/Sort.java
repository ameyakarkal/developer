package base;

public abstract class Sort implements ISort{

	protected final int[] input;
	
	public Sort(int[] input){
		this.input = input;
	}
}