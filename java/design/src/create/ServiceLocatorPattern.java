package create;

public class ServiceLocatorPattern {

	public class ServiceLocator{
	
	}
	
	public class Consumer{
		private ServiceLocator serviceLocator;
		public Consumer(ServiceLocator serviceLocator){
			this.serviceLocator = serviceLocator;
		}
		
		public void execute(){
			// this.serviceLocator.
		}
	}
	
	public interface IResource{
		
	}
	
	public class Resource {
		
	}
}
