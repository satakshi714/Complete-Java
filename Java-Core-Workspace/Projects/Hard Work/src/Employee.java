
public class Employee {
	String name;
	String projectName;
	int workingHrs;
	int bonus;
	Employee(String name, String projectName, int workingHrs){
		this.name = name;
		this.projectName = projectName;
		this.workingHrs = workingHrs;
		this.bonus = 0;
	}
	public String setBonus() {
		if((projectName.equals("web") ||projectName.equals("hack") || projectName.equals("SD") ||projectName.equals("PD") || projectName.equals("tech")) && workingHrs >= 30){
			bonus = workingHrs / 10;
			return "Congrats";
		}else {
			return "Work Hard";
		}
	}
	public String checkname() {
		if(name.equals("doselect")) {
			return projectName+workingHrs;
		}else {
			return projectName+bonus;
		}
	}
}
