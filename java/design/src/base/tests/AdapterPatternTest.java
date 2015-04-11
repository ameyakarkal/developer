package base.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import base.AdapterPattern;

public class AdapterPatternTest {

	@Test
	public void shouldQuackATurkey(){
		assertEquals(new AdapterPattern().explain(), AdapterPattern.Gobble);
	}
}
