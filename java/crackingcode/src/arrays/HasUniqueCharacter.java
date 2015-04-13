package arrays;

public class HasUniqueCharacter {

	public interface IStrategy{
		
	}
	
	public static class BruteForce implements IStrategy{
		// O(n ^ 2)
	}
	
	public static class UsingAsciiMap implements IStrategy{
		
		// assumption : the character set is ASCII
		/*
		 * create an array / directory map[256] of boolean
		 * 	for each character c = str.charAt(i) 
		 * 		if map[c] then return NOT UNIQUE
		 * 		else continue;
		 * 
		 * 	return UNIQUE (true);
		 */
	}
	
	public static class SortAndCompare implements IStrategy{
		//O(n logn) to sort the array
		 /*
		 * single pass through array. if neighboring elements are same, the character is not unique
		 */
	}
}
