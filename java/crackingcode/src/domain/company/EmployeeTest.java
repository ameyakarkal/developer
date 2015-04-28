package domain.company;

import org.junit.Test;


public class EmployeeTest {


	@Test
	public void shouldRegister(){
		
		Employee e1 = Company.getById("E32");
		Employee e2 = Company.getById("E19");
		
		System.out.println(Company.searchLowestRankManager(e1, e2));
		
	}
}
