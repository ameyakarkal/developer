package base;

import java.util.Arrays;

public class InsertionSort implements ISort{

	public InsertionSort(){
		
	}

	@Override
	public int[] sort(int[] input) {
		
		int length = input.length,
			j = 0,
			x,
			temp;
		
		for(int i = 1; 
				i < length; 
				i++){
			j = i;
			x = input[i];
			while(j > 0 && input[j -1] > input[j]){
				temp = input[j-1];
				input[j-1] = input[j];
				input[j] = temp;
				j--;
			}
			input[j] = x;
			
			System.out.println(Arrays.toString(input));
		}

		return input;
	}
	
}
