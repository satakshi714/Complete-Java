import java.util.*;
public class Almanac {
	HashMap <String, ArrayList<String>> projects = new HashMap<>();
	public String assignProject(String name, String project) {
		if(!projects.containsKey(name)) {
			ArrayList<String> list = new ArrayList<>();
			list.add(project);
			projects.put(name, list);
		}else {
			ArrayList<String> n = projects.get(name);
			n.add(project);
			projects.put(name, n);
		} 
		return "Project Assigned Successfully";
	}
	public ArrayList<String> currentProjects(String name){
		if(projects.containsKey(name)) {
			return projects.get(name);
		}
		else if(projects.get(name).size()==0) {
			return null;
		}else {
			return projects.get(name);
		}
	}
	public String finishProject(String name, String project) {
		if(projects.containsKey(name)) {
			ArrayList<String> s = projects.get(name);
			s.remove(project);
			projects.put(name, s);
		}else {
			return "Not found";
		}
		return "Project finished successfully";
	}
}
