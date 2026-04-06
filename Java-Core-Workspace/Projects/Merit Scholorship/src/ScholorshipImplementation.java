import java.util.*;
public class ScholorshipImplementation {
	static HashMap<Integer, Student> hm = new HashMap<>();
	public void addStudent(Student std) {
		hm.put(std.studentId, std);
	}
	public ArrayList<Student> getStudentDetails(String scholorshipScheme){
		ArrayList<Student> list = new ArrayList<>();
		for(Student s : hm.values()) {
			if(s.scholorshipScheme != null && s.scholorshipScheme.equals(scholorshipScheme)) {
				list.add(s);
			}
		}
		return list;
	}
	public boolean deleteStudent(int id) {
		Student s = hm.remove(id);
		if(s == null) {
			return false;
		}else {
			return true;
		}
	}
}
