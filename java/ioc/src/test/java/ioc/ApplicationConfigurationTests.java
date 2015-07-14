package ioc;

import org.junit.Test;

public class ApplicationConfigurationTests {

	@Test	
	public void shouldInitializeApplication(){
		ApplicationConfig.init();
	}
}
