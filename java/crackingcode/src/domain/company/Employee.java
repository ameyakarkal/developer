package domain.company;

public class Employee implements IManager{

	private int id;
	private String name;
	private String address;
	private int rank;
	
	private Employee firstJunior;
	private Employee secondJunior;
	
	private Employee manager;
	
	public Employee(String name){
		this.name = name;
		this.rank = 1;
	}
	
	public Employee(int id, String name, String address){
		this(name);
		this.id = id;
		this.address = address;
	}
	
	
	public int getId(){
		return this.id;		
	}
	
	public String getName(){
		return this.name;
	}

	public int getRank(){
		return this.rank;
	}

	public void setManager(Employee manager){
		this.manager = manager;
	}
	
	public Employee getFirst(){
		return this.firstJunior;
	}
	
	public Employee getSecond(){
		return this.secondJunior;
	}
	
	@Override
	public void manage(Employee employee) {
			
		if(this.firstJunior == null){
			this.firstJunior = employee;
		}
		
		else if(this.secondJunior == null){
			this.secondJunior = employee;
			
		}			

		this.rank = employee.getRank() + 1; 
		employee.setManager(this);
	}
	
	
	@Override
	public String toString(){
		return "name: "+ this.getName() + " rank:" + this.getRank();
	}

}
