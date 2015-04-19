package tree;

public class CommonAncestor {

	public interface IStrategy{
		Tree commonAncestor(Tree root, Tree p, Tree q); 
	}
	
	public class HasParentLink implements IStrategy{

		@Override
		public Tree commonAncestor(Tree root, Tree p, Tree q) {
			
			/**
			 * family01 = new ArrayList<Tree>();
			 * while(p != null){
			 *  family01.add(p);
			 * 	p = p.parent();
			 * }
			 * family02 = new ArrayList<Tree>();
			 * while(q != null){
			 *  family02.add(q);
			 *  q = q.parent();
			 * }
			 * find intersection of family01 and family 02. first match is common ancestor
			 */
			
			return null;
		}
		
	}

	public class CoveringStrategy implements IStrategy{

		@Override
		public Tree commonAncestor(Tree root, Tree p, Tree q) {
			
			Tree left = root.getLeft();
			if(covers(left, p) && covers(left, q)){
				return commonAncestor(left, p, q);
			}
			
			Tree right = root.getRight();
			if(covers(right, p) && covers(right, q)){
				return commonAncestor(right, p , q);
			}
			
			return root;
		}
		
		public boolean covers(Tree parent, Tree child){
			if(parent == null) return false;
			
			if(parent == child) return true;
			
			return covers(parent.getLeft(), child) || covers(parent.getRight(), child);
		}
	}
}