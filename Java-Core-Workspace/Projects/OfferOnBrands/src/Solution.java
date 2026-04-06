import java.util.*;
public class Solution {
	public static void main(String[] args) {
		List<Model> list = new ArrayList<>();
		list.add(new Model("SUV", 500));
		list.add(new Model("Sedan", 800));
		Implementation i = new Implementation();
		System.out.println(i.getModelName(list));
		System.out.println(i.getModelInfo(list, "SUV", 500));
	}
}
