package base.tests;

public class LinkedStack {

	private Node top;
	private class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
		}		
	}
	
	public LinkedStack(int data){
		this.top = new Node(data);
		
	}
	
	public void push(int data){
		Node node = new Node(data);
		node.next = this.top;
		this.top = node;
	}
	
	public int pop(){
		if(this.top == null) return Integer.MAX_VALUE;
		int data = this.top.data;
		this.top = this.top.next;
		return data;
	}
}
