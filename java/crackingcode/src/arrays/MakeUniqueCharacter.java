package arrays;

/**
 * given a string remove all duplicates.
 * @author akarkal
 *
 */
public class MakeUniqueCharacter {

	private interface IStrategy{
		
	}
	
	public class DictionaryStrategy implements IStrategy{
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
	
	public class WithDictionaryStrategy implements IStrategy{
		/**
		 * for the first string, scan each char.
		 * for each char in the second string,
		 * 		scan till head to make sure that t
		 */
	}
}
