package base.tests;

import java.util.Arrays;

import org.junit.Test;

import base.BubbleSort;
import base.ISort;

public class BubbleSortTests {

	private ISort sortingAlgorithm;
	
	{
		sortingAlgorithm = new BubbleSort();
	}
	
	@Test
	public void shouldSort(){
		int[] data = new int[] { 2, 1, 3 };
		
		System.out.println(Arrays.toString(sortingAlgorithm.sort(data)));
	}
}
