package base;

public class BubbleSort extends Sort{

	public BubbleSort(int[] input){
		super(input);
	}
	
	@Override
	public int[] sort() {
		boolean swapped = true;
		int temp; 
		while(swapped){
			swapped = false;
			for(int i = 1; i < this.input.length; i++){
				if(this.input[i -1] > this.input[i]){
					temp = this.input[i-1];
					this.input[i-1] = this.input[i];
					this.input[i] = temp;
					swapped = true;
				}
			}
		}
		return this.input;
	}
	
	
}