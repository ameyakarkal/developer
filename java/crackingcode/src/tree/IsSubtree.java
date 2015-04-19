package tree;

public class IsSubtree {

	public interface IStrategy{
		
	}
	
	public class Strategy implements IStrategy{
		
		/**
		 * isSubtree
		 * if LARGE.DATA == SMALL.DATA try MATCH the LARGE AND SMALL
		 * isSubtree LARGE.LEFT with SMALL
		 * isSubtree LARGE.RIGHT with SMALL
		 * 
		 * 
		 */
		
		public boolean isSubtree(Tree large, Tree small){			
			if(large == null) return false;
			
			if(large.getData() == small.getData()) return matchTree(large, small);
			
			return isSubtree(large.getLeft(), small) || isSubtree(large.getRight(), small);
		}
		
		public boolean matchTree(Tree large, Tree small){
			if(large == null && small == null) return true;
			
			if(large == null || small == null) return false;
		
			if(large.getData() != small.getData()) return false;
			
			return matchTree(large.getLeft(), small) || matchTree(large.getRight(), small);
		}
		
	}
}