
public class Solution {
	public static void main(String[] args) throws Exception{
		SalaryData s = new SalaryData("Steve", 30, 10000);
		Validator v = new Validator();
		System.out.println(v.candidateSalaryData(s));
		System.out.println(v.getTotalSalary(s));
	}
}
