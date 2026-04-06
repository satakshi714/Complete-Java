
public class Solution {
	public static void main(String[] args) {
		Salary sal = new Salary();
		sal.empList.put("CEO", 20000);
		sal.empList.put("Developer", 4000);
		sal.empList.put(null, 4000);
		System.out.println(sal.totalSalary());
		sal.updateSalary("Developer",6000);
		System.out.println(sal.getSalary("Developer"));
		System.out.println(sal.getSalary("Sales"));
	}
}
