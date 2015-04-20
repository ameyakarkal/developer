package recursion;

public class Fibonacci {

	public Fibonacci(int max){
		
	}
	
	public int fibo(int n){
		if(n == 0) return 0;
		
		if(n == 1) return 1;
		
		if(n < 0) throw new IllegalStateException("invalid");
		
		return fibo(n-1) + fibo(n -2);
	}
}