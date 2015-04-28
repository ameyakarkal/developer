package base;

public class PassByReference {

	public class Person{
		
		private String name;
		
		public Person(String name){
			this.name = name;
		}
		
		public String getName(){
			return this.name;
		}
		
		@Override
		public String toString(){
			return this.getName();
		}
	}

	
	public void Switch(Person p){
		p = new Person("switched" + p.getName());
		
	}
	
	public void Switch(int number){
		number = number -1;
	}
	
	public static void main(String[] args){
		PassByReference ref = new PassByReference();
		
		Person first = ref.new Person("first");
		
		ref.Switch(first);
		
		System.out.println(first);
		
		int i = 200;
		ref.Switch(i);
		System.out.println(i);
	}
}
