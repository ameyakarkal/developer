package base.tests;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import base.ISort;
import base.MergeSort;

public class MergeSortTests {

	@Test
	public void shouldNotBeNull() {
		ISort algorithm = new MergeSort(new int[]{ 1, 2 });
		
		Assert.assertNotNull(algorithm);
	}
	
	@Test
	public void shouldSplitInput(){
		int[] input = new int[] { 1, 2, 3 };
		int from = 0;
		int mid = input.length / 2;
		int to = input.length;
		
		MergeSortDummy sort = new MergeSortDummy(input);
		
		System.out.println(Arrays.toString(sort.split(input, from, mid)));
		System.out.println(Arrays.toString(sort.split(input, mid, to)));
	}
	
	@Test
	public void shouldMergeInputs(){
		int[] first = new int[] { 1 };
		int[] second = new int[] { 2, 3};
		
		MergeSortDummy sort = new MergeSortDummy(new int[]{});
		System.out.println(Arrays.toString(sort.merge(second, first)));
	}
	
	@Test
	public void shouldSort(){
		ISort algorithm = new MergeSort(new int[]{ 2, 1, 4, 5, 8 });
		
		System.out.println(Arrays.toString(algorithm.sort()));
	}
	
	private class MergeSortDummy extends MergeSort{
		public MergeSortDummy(int[] input) {
			super(input);
		}
		
		public int[] split(int[] input, int from, int to){
			return super.split(input, from, to);
		}
		
		public int[] merge(int[] first, int[] second){
			return super.merge(first, second);
		}
		
	}
}