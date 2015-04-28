package domain.company;

import java.util.HashMap;
import java.util.Map;

/**
 * find least common manager between two employees in a company
 *
 */
public class Company {
	private static Company instance = new Company();
	private static Employee root = null;
	private static Map<String, Employee> directory = new HashMap<String, Employee>();
	
	static {
		registerEmployees();
		registerManagers();
	}
	
	private Company(){
	}
	
	public static Company getInstance(){
		return instance;
	}
	
	public static Employee getById(String id){
		return directory.get(id);
	}
	
	
	private static void registerEmployees(){
		String key;
		for(int id = 11; id < 51; id++){
			key = "E" + id;
			directory.put(key, new Employee(key));
		}
	}
	
	private static void registerManagers(){
		getById("E20").manage(getById("E11"));
		getById("E21").manage(getById("E12"));		
		getById("E22").manage(getById("E13"));
		getById("E22").manage(getById("E14"));		
		getById("E23").manage(getById("E15"));		
		getById("E24").manage(getById("E16"));
		getById("E24").manage(getById("E17"));
		getById("E25").manage(getById("E18"));
		getById("E25").manage(getById("E19"));		
		
		getById("E30").manage(getById("E20"));
		getById("E30").manage(getById("E21"));		
		getById("E31").manage(getById("E22"));
		getById("E32").manage(getById("E23"));		
		getById("E33").manage(getById("E24"));		
		getById("E33").manage(getById("E25"));		
		
		
		getById("E40").manage(getById("E30"));		
		getById("E40").manage(getById("E31"));		
		
		getById("E41").manage(getById("E32"));		
		getById("E41").manage(getById("E33"));		
		
		getById("E50").manage(getById("E40"));		
		getById("E50").manage(getById("E41"));		
		
		root = getById("E50");
	}
	
	public static Employee searchLowestRankManager(Employee p, Employee q){
		return commonAncestor(root, p, q);
	}
	
	private static Employee commonAncestor(Employee manager, Employee p, Employee q) {
		
		Employee first = manager.getFirst();
		if(covers(first, p) && covers(first, q)){
			return commonAncestor(first, p, q);
		}
		
		Employee right = manager.getSecond();
		if(covers(right, p) && covers(right, q)){
			return commonAncestor(right, p , q);
		}
		
		return manager;
	}
	
	private static boolean covers(Employee manager, Employee employee){
		if(manager == null) return false;
		
		if(manager == employee) return true;
		
		return covers(manager.getFirst(), employee) || covers(manager.getSecond(), employee);
	}
	
}
