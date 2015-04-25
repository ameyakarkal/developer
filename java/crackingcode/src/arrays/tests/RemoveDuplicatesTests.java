package arrays.tests;

import org.junit.Test;

import arrays.RemoveDuplicates;

public class RemoveDuplicatesTests {

	@Test
	public void shouldRemoveDuplicates(){
		RemoveDuplicates.InplaceStrategy algo = new RemoveDuplicates.InplaceStrategy();
		String actual = algo.filter("yabababx");
		System.out.println("out:" + actual);
	}
	
}