package arrays;

public class ReverseString {

	private interface IStrategy{
		
	}
	
	public class InPlaceSwapStrategy implements IStrategy{
		
		/**
		 * take a pointer to the last position of the string.
		 * keep pointer to the first position of the string
		 * while(head < tail){
		 * 		temp = head
		 * 		head = tail
		 * 		tail = temp
		 * }
		 */
	}
	
	
	
	public static void main(String args[]){
	
		String a = "abc";
		
		int length = a.length();
		
		String reverse = "";
		for(int i = length -1; i >= 0; i--){
			reverse += a.charAt(i);
		}
		
		System.out.println(reverse);
	}
}