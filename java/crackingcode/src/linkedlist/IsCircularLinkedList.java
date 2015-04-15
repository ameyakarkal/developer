package linkedlist;

public class IsCircularLinkedList {

	/**
	 * A -> B -> C -> D -> E -> C
	 * 
	 * there should be two pointers
	 * 
	 * slowPointer moves one node at a time
	 * 
	 * slowPointer  = slowPointer.next;
	 * 
	 * fasterPointer moves two nodes at a time
	 * 
	 * fastPointer = fastPointer.next.next
	 */
	
	/*
	 * while(fastPointer.next != null){
	 * 		slowPointer = slowPointer.next;
	 * 		fastPointer = fastPointer.next.next;
	 * 		if(slowPointer == fastPointer){
	 * 			//there is a circular linked list
	 * 			break;
	 
	 * 		}
	 * }
	 * 
	 * if(fastPointer.next == null){
	 * 	 //there is no circular linked list
	 * }
	 */
}
