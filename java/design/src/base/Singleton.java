package base;

public class Singleton {

	public enum SingletonEnum{
		Instance;
		
		public static SingletonEnum getInstance(){
			return Instance;
		}
	}
}
