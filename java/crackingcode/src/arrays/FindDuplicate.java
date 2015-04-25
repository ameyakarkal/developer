package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

	public enum Occurance{
		Single,
		Multiple
	}
	
	public Map<Integer, Occurance> occuranceDirectory= new HashMap<Integer,Occurance>();
	
	public int find(int[] array){
		
		if(array == null || array.length == 0)
			throw new IllegalArgumentException("array is required");
		
		for(int i : array){
			
			if(occuranceDirectory.containsKey(i)) return i;
			
			occuranceDirectory.put(i, Occurance.Single);
		}
		
		return -1;
	}
}
