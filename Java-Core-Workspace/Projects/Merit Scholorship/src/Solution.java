import java.util.*;
public class Solution {
	public static void main(String[] args) {
		ScholorshipImplementation si = new ScholorshipImplementation();
		Student s1 = new Student("Mary", 666, 93);
		Student s2 = new Student("Harry", 654, 94);
		Student s3 = new Student("May", 612, 92);
		Student s4 = new Student("Mia", 566, 91);
		s1.setScholorshipScheme("abc");
        s3.setScholorshipScheme("abc");
		si.addStudent(s1);
		si.addStudent(s2);
		si.addStudent(s3);
		si.addStudent(s4);
		System.out.println(si.getStudentDetails("abc"));
		System.out.println(si.deleteStudent(622));
	}
}
