package design;

public class EmployeeChainOfResponsibility {

	public interface IEmployee {
		boolean handleCall(int callRank);
	}
	
	public class Employee implements IEmployee{
		private final IEmployee next;
		private final int rank;
		public Employee(int rank, Employee next){
			this.rank = rank;
			this.next = next == null ? new NullEmployee() : next;
					
		}
		
		public boolean handleCall(int callRank){
			if(callRank < this.rank){
				return true;
			}
			
			return next.handleCall(callRank);
		}
	}
	
	public class NullEmployee implements IEmployee{

		public NullEmployee() {
		}

		public boolean handleCall(int callRank){
			return false;
		}
	}
	
	public void run(){
		Employee manager = new Employee(2, null);
		Employee lead = new Employee(1, manager);
		Employee fresher = new Employee(0,lead);
		
		fresher.handleCall(1);
	}
}