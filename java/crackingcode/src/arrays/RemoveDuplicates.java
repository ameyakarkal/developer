package arrays;

/**
 * given a string remove all duplicates.
 * @author akarkal
 *
 */
public class RemoveDuplicates {

	private interface IStrategy{
		String filter(String input);
	}
	
	public static class DictionaryStrategy implements IStrategy{

		@Override
		public String filter(String input) {
			// TODO Auto-generated method stub
			return null;
		}
		/**
		 * pointer to head of first string
		 * pass over second string O(n), 
		 * 		if the character DOES NOT exist in hash map
		 * 		01.  add to hashtable
		 * 		02.  head[current] = current character
		 * 		03.  head++    
		 * 		else 
		 * 
		 */
		
	}
	
	public static class InplaceStrategy implements IStrategy{
		/**
		 * Similar to insertion sort. the first part of the array till the tail is kept unique.
		 * tail is incremented and unique value is copied to input[tail]
		 * 
		 */
		
		@Override
		public String filter(String input) {
			
			char[] inputChar = input.toCharArray();
			char current;
			int length = inputChar.length;
			
			int tail = 1;
			boolean firstOccurance;
			
			for(int i=1; i < length; i++){
				current = inputChar[i];
				
				/**
				 * checks if the current already exists in the unique array input[0 to tail]
				 */
				firstOccurance = true;
				for(int walker = 0; walker < tail; walker++){
					if(inputChar[walker] == current) {
						firstOccurance = false;
						break;
					}
				}
				
				if(firstOccurance){
					inputChar[tail] = current;
					tail++;
				}
			}
			
			return new String(inputChar, 0, tail);
		}		
	}
}
