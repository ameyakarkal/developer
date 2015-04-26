package stack.tests;

import java.util.Arrays;

import org.junit.Test;

import stack.SortUsingStack;

public class SortUsingStackTest {

	@Test	
	public void shouldSort(){
		int[] actual = new SortUsingStack().sort(new int[] { 2, 1, 4, 5 });
		
		System.out.println(Arrays.toString(actual));
	}
}
