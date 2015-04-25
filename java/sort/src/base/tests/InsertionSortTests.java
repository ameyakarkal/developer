package base.tests;

import java.util.Arrays;

import org.junit.Test;

import base.ISort;
import base.InsertionSort;

public class InsertionSortTests {

	private ISort sortingAlgorithm;
	
	{
		sortingAlgorithm = new InsertionSort();
	}
	
	@Test
	public void shouldSortArray(){
		int[] actual = sortingAlgorithm.sort(new int[] { 8, 6, 4, 3, 2, 1});
		
		System.out.println(Arrays.toString(actual));
	}
}
