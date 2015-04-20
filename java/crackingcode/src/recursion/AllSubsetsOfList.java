package recursion;

import java.util.ArrayList;

public class AllSubsetsOfList {

	public static class Strategy{
		
		private static final ArrayList<ArrayList<Integer>> EMPTY = new ArrayList<ArrayList<Integer>>();
		
		//a, b, c
		/**
		 * a b c
		 * find([a,b,c],0)
		 * 	-> find([a,b,c], 1)
		 * 		-> find([a,b,c], 2)
		 * 			-> find([a,b,c],3)
		 * 		empty
		 * 		c
		 */
		public ArrayList<ArrayList<Integer>> find(
				ArrayList<Integer> set, int index){
			
			if(set.size() == index){
				return EMPTY;
			}
			
			return null;
		}
	}
}