package tree;

public class IsSubtree {

	public interface IStrategy{
		
	}
	
	public class Strategy implements IStrategy{
		
		
		public boolean isSubtree(Tree large, Tree small){
			if(large == null) return false;
			
			if(large.getData() == small.getData()) return matchTree(large, small);
			
			return matchTree(large.getLeft(), small) || matchTree(large.getRight(), small);
		}
		
		public boolean matchTree(Tree large, Tree small){
			if(large == null && small == null) return true;
			
			if(large == null || small == null) return false;
		
			if(large.getData() != small.getData()) return false;
			
			return matchTree(large.getLeft(), small) || matchTree(large.getRight(), small);
		}
		
	}
}