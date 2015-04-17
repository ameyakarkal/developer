package base;

import java.util.Arrays;

public class MergeSort extends Sort{
	
	public MergeSort(int[] input){
		super(input);
	}

	@Override
	public int[] sort() {
		return sortRecursively(this.input);
	}
	
	protected int[] sortRecursively(int[] input){
		int length = input.length;
		
		if(length == 1) return input;
		
		int mid = length / 2;
		
		int[] sortedFirstHalf = sortRecursively(split(input, 0, mid));
		
		int[] sortedSecondHalf = sortRecursively(split(input, mid, length));
		
		return merge(sortedFirstHalf, sortedSecondHalf);
	}
	
	protected int[] split(int[] input, int from, int to){
		return Arrays.copyOfRange(input, from, to);
	}
	
	protected int[] merge(int[] first, int[] second){
		int firstWalker = 0, secondWalker = 0, combinedWalker = 0;
		int firstLength = first.length;
		int secondLength = second.length;
		int[] output = new int[firstLength + secondLength];
		
		while(firstWalker < firstLength && secondWalker < secondLength){
			
			if(first[firstWalker] < second[secondWalker]){
				output[combinedWalker] = first[firstWalker];
				firstWalker++;
			}
			else{
				output[combinedWalker] = second[secondWalker];
				secondWalker++;
			}
			combinedWalker++;
		}
		
		while(firstWalker < firstLength)
			output[combinedWalker++] = first[firstWalker++];
		
		while(secondWalker < secondLength)
			output[combinedWalker++] = second[secondWalker++];
		
		return output;
	}
}