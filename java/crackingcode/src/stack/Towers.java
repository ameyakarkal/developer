package stack;

import java.util.Stack;

public class Towers {

	public static final int NumberOfTowers = 3;
	private Tower[] towers = new Tower[NumberOfTowers];
	
	public Towers(){
		for(int i =0; i < NumberOfTowers; i++){
			this.towers[i] = new Tower(i + 1); 
		}
	}
	
	public static class Tower{
		private int id;
		private Stack<Integer> disks;
		Tower(int id){
			this.id = id;
			this.disks = new Stack<Integer>();
		}
		
		public void push(int disk){
			if(!this.disks.isEmpty() && this.disks.peek() <= disk)
				throw new RuntimeException("higher disk kept on lower disk");
			
			disks.push(disk);
			System.out.println("pushed disk:" + disk + " on tower "+ id);
		}
		
		
		/**
		 * for moving n disk from this to destination
		 * 1. move n-1 disk to buffer.
		 * 2. move the top disk to destination
		 * 3. move n-1 disk from buffer to destination using this as buffer.
		 * 
		 * @param n
		 * @param destination
		 * @param buffer
		 */
		public void moveDisk(int n, Tower destination, Tower buffer){
			if(n <= 0) return;
			
			moveDisk(n-1, buffer, destination);
			
			Integer topDisk = this.disks.pop();
			
			destination.push(topDisk);
			
			buffer.moveDisk(n -1, destination, this);
		}
	}
	
	
	public void run(int numberOfdisks){
		Tower source = this.towers[0];
		Tower destination = this.towers[2];
		Tower buffer = this.towers[1];
		
		for(int i= numberOfdisks; i > 0; i--)
			source.push(i);
		
		source.moveDisk(numberOfdisks, destination, buffer);
	}
}
