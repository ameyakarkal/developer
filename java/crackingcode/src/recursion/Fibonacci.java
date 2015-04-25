package recursion;

public class Fibonacci {

	public Fibonacci(int max){
		
	}
	
	public int fibonacci(int n){

		/*
		 * part 01 : set of exit conditions
		 */
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		/**
		 * part 02 : calling itself with different set of parameters
		 */
		return fibonacci(n-1) + fibonacci(n -2);
	}
	
	public static void main(String args[]){
		System.out.println(new Fibonacci(1).fibonacci(8));
	}
}