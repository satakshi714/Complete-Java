
public class Validator {
	public static String candidateSalaryData(SalaryData s) throws Exception{
		int days = s.daysInMonth;
		if(days != 28 && days != 30 && days != 31) {
			throw new InvalidDaysException("Invalid Days");
		}
		double sal = s.salary;
		if(sal < 0 || sal > 1000000) {
			throw new InvalidSalaryException("Invalid Salary");
		}
		return "Valid Data";
	}
	public static double getTotalSalary(SalaryData s) {
		try {
			candidateSalaryData(s);
			return s.daysInMonth * s.salary;
		}catch(InvalidDaysException e) {
			return 0.0;
		}catch(InvalidSalaryException e) {
			return 0.0;
		}catch(Exception e) {
			return 0.0;
		}
	}
}
