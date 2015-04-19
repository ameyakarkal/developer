package tree;

public class Tree {

	private Tree left;
	private Tree right;
	private int data;
	
	public Tree(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
		
	public void add(int data){
		if(data < this.data){

			if(this.left == null){
				this.left = new Tree(data);
				return;
			}

			this.left.add(data);
		}
		else{

			if(this.right == null){
				this.right = new Tree(data);
				return;
			}
			
			this.right.add(data);
		}
	}
	
	public Tree getLeft(){
		return this.left;
	}
	
	public Tree getRight(){
		return this.right;
	}
}
