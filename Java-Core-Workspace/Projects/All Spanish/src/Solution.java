import java.util.*;
public class Solution  {
	public static void main(String[] args) {
		DishTest d = new DishTest();
		List<Dish> ls = new ArrayList<>();
		ls.add(new Dish("Chips"));
		ls.add(new Dish("Soup"));
		ls.add(new Dish("Pasta"));
		System.out.println(d.addYummyToName(ls));
		System.out.println(d.count(ls, "s"));
	}
}
