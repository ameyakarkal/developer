package arrays;

public class IsAnagram {

	private interface IStrategy{
		
	}
	
	private class SortingStrategy implements IStrategy{
		/**
		 * 01. check if lengths of two string are same
		 * 02. sort the character of the string O(n log n)
		 * 03. single pass to check if the strings are equal O(n)
		 */
	}
	
	private class MapOfCharacterStrategy implements IStrategy{
		/**
		 * count per characters in the first string
		 * count per characters in the second string
		 * if the map match then anagram
		 */
	}
}