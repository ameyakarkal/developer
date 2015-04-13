package create.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import create.AdapterPattern;

public class AdapterPatternTest {

	@Test
	public void shouldQuackATurkey(){
		assertEquals(new AdapterPattern().explain(), AdapterPattern.Gobble);
	}
}
