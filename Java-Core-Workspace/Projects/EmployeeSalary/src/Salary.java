import java.util.HashMap;

public class Salary {
	HashMap<String, Integer> empList = new HashMap<>();
	
	public int totalSalary() {
		int total = 0;
		for(Integer i : empList.values()) {
			total += i;
		}
		return total;
	}
	public String getSalary(String designation) {
		if(empList.containsKey(designation)) {
			return "Salary is "+ empList.get(designation);
		}else {
			return "No designation Match";
		}
	}
	public void updateSalary(String designation, int newSalary) {
		empList.put(designation, newSalary);
	}
}
