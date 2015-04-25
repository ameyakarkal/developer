package base;

public class Meta {

	public enum BigO{
		Nsquared,
		NLogN
	}
	
	private String name;
	private Meta.BigO complexity;
	private String description;
	
	private Meta(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		return new StringBuilder()
		.append("Name ")
		.append(this.name)
		.toString();
	}
	
	public static class Builder{
		public static Meta getInstance(String name, Meta.BigO complexity){
			return new Meta(name);
		}
	}
}
