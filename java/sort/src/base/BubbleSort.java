
package base;

public class BubbleSort implements ISort{

	private Meta meta;
	public BubbleSort(){
		this.meta = Meta.Builder.getInstance(
				"BubbleSort",
				Meta.BigO.Nsquared);
	}
	
	@Override
	public int[] sort(int[] input) {
		boolean swapped = true;
		int temp; 
		while(swapped){
			swapped = false;
			for(int i = 1; i < input.length; i++){
				if(input[i -1] > input[i]){
					temp = input[i-1];
					input[i-1] = input[i];
					input[i] = temp;
					swapped = true;
				}
			}
		}
		return input;
	}
}