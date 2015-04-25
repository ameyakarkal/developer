package stack.tests;

import org.junit.Test;

import stack.Towers;

public class TowersTest {

	@Test
	public void shouldMoveDisks(){
		new Towers().run(4);
	}
}
