package recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubstrings {

	public List<String> getSubstring(String s){
		
		if(s == null) return null;
		
		if(s.length() == 0) return new ArrayList<String>();
		
		char first = firstCharacter(s);
		String reminder = reminder(s);
		
		List<String> permutations = getSubstring(reminder);
		String permutation;
		for(String word : permutations){
			
			for(int i = 0; i < reminder.length(); i++){
			
				permutation = insertCharacterAt(word, first, i);
				
				permutations.add(permutation);
				
			}	
		}
		
		return permutations;
		
	}
	
	protected char firstCharacter(String s){
		return s.charAt(0);
	}
	
	protected String reminder(String s){
		return s.substring(1);
	}
	
	protected String insertCharacterAt(String s, char c, int index){
		return s.substring(0, index) + c + s.substring(index);
	}
}
