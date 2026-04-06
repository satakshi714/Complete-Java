import java.util.*;
public class Source {
	public ArrayList<String> changeOccurance(ArrayList<String> a, String m, String n){
		ArrayList<String> res = new ArrayList<>();
		for(String s : a) {
			if(s.equals(m)) {
				res.add(n);
			}else {
				res.add(s);
			}
		}
		return res;
	}
	public String listIndex(ArrayList<String> list) {
		return list.get(0);
	}
	public ArrayList<String> listAfter(ArrayList<String> a, String m, String n){
		ArrayList<String> res = new ArrayList<>();
		a.add(a.indexOf(m)+1, n);
		for(int i = 0; i < a.size(); i++) {
			res.add(a.get(i));
		}
		return res;
	}
}
