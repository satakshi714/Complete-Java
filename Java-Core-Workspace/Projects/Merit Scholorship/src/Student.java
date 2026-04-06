
public class Student {
	String studentName;
	Integer studentId;
	int studentScore;
	String scholorshipScheme;
	Student(String studentName, Integer studentId, int studentScore){
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentScore = studentScore;
		this.scholorshipScheme = "";
	}
	public void setScholorshipScheme(String scheme) {
	    this.scholorshipScheme = scheme;
	}

	@Override
	public String toString() {
		return studentName;
	}
}
