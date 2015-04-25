package base.tests;

import java.util.Arrays;

import org.junit.Test;

import base.ISort;
import base.MergeSort;

public class MergeSortTests {

	private ISort sortingAlgorithm;
	{
		sortingAlgorithm = new MergeSort();
	}
	
	@Test
	public void shouldSplitInput(){
		int[] input = new int[] { 1, 2, 3 };
		int from = 0;
		int mid = input.length / 2;
		int to = input.length;
		
		MergeSortDummy sort = new MergeSortDummy();
		
		System.out.println(Arrays.toString(sort.split(input, from, mid)));
		System.out.println(Arrays.toString(sort.split(input, mid, to)));
	}
	
	@Test
	public void shouldMergeInputs(){
		int[] first = new int[] { 1 };
		int[] second = new int[] { 2, 3};
		
		MergeSortDummy sort = new MergeSortDummy();
		System.out.println(Arrays.toString(sort.merge(second, first)));
	}
	
	@Test
	public void shouldSort(){
		int[] input = new int[]{ 2, 1, 4, 5, 8 };
		System.out.println(Arrays.toString(sortingAlgorithm.sort(input)));
	}
	
	private class MergeSortDummy extends MergeSort{

		public int[] split(int[] input, int from, int to){
			return super.split(input, from, to);
		}
		
		public int[] merge(int[] first, int[] second){
			return super.merge(first, second);
		}
		
	}
}