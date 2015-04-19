package tree;

public class IsBalancedTree {

	/**
	 * a tree is balanced if
	 * 
	 * DIFFERENCE BETWEEN MAX DEPTH OF TREE AND MIN DEPTH OF TREE <= 1
	 */
	
	public interface IStrategy{
		public boolean test(Tree tree);
	}
	
	public class Strategy implements IStrategy{

		public int maxDepth(Tree node){
			if(node == null) return 0;
			
			return 1 + Math.max(maxDepth(node.getLeft()), maxDepth(node.getRight()));
		}
		
		public int minDepth(Tree node){
			if(node == null) return 0;
			
			return 1 + Math.min(minDepth(node.getLeft()), minDepth(node.getRight()));
		}

		@Override
		public boolean test(Tree tree) {
			
			int maxDepth = maxDepth(tree);
			int minDepth = minDepth(tree);

			return Math.abs(maxDepth - minDepth) <= 1;
		}
		
	}
	
}
