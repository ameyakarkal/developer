package stack;


public class StackWithMinimum {

	public interface IStrategy {
		/*
		 * stack.min() returns minimum value of the stack in O(1)
		 */		
	}
	
	public class MinimumAtNode implements IStrategy{
		
		/**
		 * here we save the minimum with each node,
		 * thus the node contains the minimum value of the stack when this node was added.
		 */
		
		private class Node {
			private final int data;
			private final int min;
			private Node next;
			Node(int data, int min){
				this.data = data;
				this.min = min;
			}
		}
		
		public void Add(int data, int min){
			
		}
	}
	
	public class MinimumStack implements IStrategy{
		/**
		 * stack maintains a stack of minimum integer,
		 * when a minimum is popped from the stack, the number is popped from the minimum stack as well
		 */
	}
	
}