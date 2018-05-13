package employeeimportance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
	class Employee {
	    // It's the unique id of each node;
	    // unique id of this employee
	    public int id;
	    // the importance value of this employee
	    public int importance;
	    // the id of direct subordinates
	    public List<Integer> subordinates;
	}
	Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees)
            empMap.put(e.id, e);
        return getImportance(id);
    }
    
    public Employee findEmployee(int id) {
        return empMap.get(id);
    }
    
    public int getImportance(int id) {
        Employee emp = findEmployee(id);
        int imp = emp.importance;
        for (int sub : emp.subordinates) {
            imp += getImportance(sub);
        }
        return imp;
    }
}
