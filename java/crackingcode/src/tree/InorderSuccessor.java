package tree;

public class InorderSuccessor {

	private interface IStrategy{
		
	}
	
	public class Strategy implements IStrategy{
		
		
		// INORDER : left -> process current -> right
		
		/**
		 * EXAMPLE 
		 *   		 a
		 *   	b			c
		 *   d		e	f		g
		 */
		
		/**
		 * to find the in order successor
		 * 1. IF HAS RIGHT CHILD 
		 * 		THEN LEFT MOST CHILD OF RIGHT CHILD (a -> f)
		 * 2. ELSE 
		 * 		IF IS LEFT MOST CHILD (PARENT IS NOT NULL AND PARENTS LEFT CHILD IS CURRENT) (d -> b)
		 * 			RETURN PARENT
		 * 		ELSE
		 * 			MOVE TO PARENTS' PARENT TILL IT IS NOT NULL  2. (e -> a)
		 * 	
		 */
	}
}
