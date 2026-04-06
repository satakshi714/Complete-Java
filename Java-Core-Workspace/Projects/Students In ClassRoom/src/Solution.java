import java.util.*;
public class Solution {
	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 list.add("d");
		 Source s = new Source();
		 System.out.println(s.changeOccurance(list, "b", "s"));
		 System.out.println(s.listIndex(list));
		 System.out.println(s.listAfter(list, "d", "f"));
	}
}
