package base.tests;

import org.junit.Assert;
import org.junit.Test;

import base.ISort;
import base.MergeSort;

public class MergeSortTests {

	@Test
	public void test() {
		ISort algorithm = new MergeSort(new int[]{ 1, 2 });
		
		Assert.assertNotNull(algorithm);
	}
}