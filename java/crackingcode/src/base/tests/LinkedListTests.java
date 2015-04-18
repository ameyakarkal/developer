package base.tests;

import java.util.Iterator;

import org.junit.Test;

import base.LinkedList;

public class LinkedListTests {

	@Test
	public void shouldCreateLinkedList(){
		LinkedList list = new LinkedList(0);
		
		for(int i = 1; i < 10; i ++){
			list.add(i);			
		}
		
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()){
			System.out.print(i.next());
			System.out.print(" -> ");
		}
		System.out.println("null");
	}
}
