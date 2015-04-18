package base;

import java.util.Iterator;

public class LinkedList {
	
	private class Node{
		Node next;
		int data;
		
		public Node(int data){
			this.data = data;
		}		
	}
	
	private class ListIterator implements Iterator<Integer>{

		private Node current;
		public ListIterator(Node head){
			this.current = head;
		}
		
		@Override
		public boolean hasNext() {			
			return this.current != null;
		}

		@Override
		public Integer next() {
			int data = this.current.data;
			this.current = this.current.next;
			return data;
		}		
	}
	
	private final Node head;
	private Node current;
	public LinkedList(int data){
		this.head = new Node(data);
		this.current = this.head;
	}
	
	public void add(int data){
		Node node = new Node(data);
		this.current.next = node;
		this.current = node;
	}
	
	public Iterator<Integer> iterator(){
		return new ListIterator(this.head);
	}
}
