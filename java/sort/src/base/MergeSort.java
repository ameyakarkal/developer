package base;

import java.util.Arrays;

public class MergeSort implements ISort{

	private final int[] _input;
	
	public MergeSort(int[] input){
		_input = input;
	}

	@Override
	public int[] sort() {
		return sortRecursively(_input);
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
		int firstSourceLength = first.length;
		
		int secondSourceLength = second.length;
		
		int maxLength = Math.max(firstSourceLength, secondSourceLength);
		
		int[] output = new int[maxLength];
		
		for(int walker = 0; walker < maxLength; walker++)
		{
			if(firstSourceLength > walker && secondSourceLength > walker)
			{
				output[walker] = Math.min(first[walker], second[walker]);
				continue;
			}
			
			if(firstSourceLength > walker){
				output[walker] = first[walker];
				continue;
			}
			
			output[walker] = second[walker];
		}
		
		return output;
	}
}