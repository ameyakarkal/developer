package tree;

public class InorderSuccessor {

	private interface IStrategy{
		
	}
	
	public class Strategy implements IStrategy{
		
		
		// INORDER : left -> process current -> right
		
		/**
		 * to find the in order successor
		 * 1. if right is not null, return right node
		 * 2. if parent is not null ->
		 *      if current is the left child of the parent, then return parent
		 * 3. if parent is null, find the left most child of right child.
		 */
	}
}
