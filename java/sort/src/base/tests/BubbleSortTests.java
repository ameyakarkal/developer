package base.tests;

import java.util.Arrays;

import org.junit.Test;

import base.BubbleSort;

public class BubbleSortTests {

	@Test
	public void shouldSort(){
		int[] data = new int[] { 2, 1, 3 };
		System.out.println(Arrays.toString(new BubbleSort(data).sort()));
	}
}
