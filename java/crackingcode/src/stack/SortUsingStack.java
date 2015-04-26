package stack;

import java.util.Stack;

public class SortUsingStack {

	public int[] sort(int[] input){
		Stack<Integer> inputStack = asStack(input);
		Stack<Integer> buffer = new Stack<Integer>();
			
		Integer temp;
		while(!inputStack.isEmpty()){
			
			temp = inputStack.pop();
			while(!buffer.isEmpty() && buffer.peek() > temp){
				inputStack.push(buffer.pop());
			}
			
			buffer.push(temp);
		}
		
		return asArray(buffer);
	}
	
	/**
	 * helper functions to convert to and from stack to array. ignore
	 */
	
	private static Stack<Integer> asStack(int[] input){
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < input.length; i++)
			stack.push(input[i]);

		return stack;
	}
	
	private static int[] asArray(Stack<Integer> stack){
		int length = stack.size();
		int[] output = new int[length];
		int index = length;
		
		while(!stack.isEmpty()){
			output[--index] = stack.pop();
		}
		
		return output;
	}
	
}
