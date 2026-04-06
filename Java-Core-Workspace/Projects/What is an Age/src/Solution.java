import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Perry", 20));
		list.add(new Person("Ferry", 52));
		list.add(new Person("Katty", 100));
		list.add(new Person("Elly", 14));
		System.out.println(StreamImplementation.sumAge(list));
		System.out.println(StreamImplementation.printName(list));
		System.out.println(StreamImplementation.printAge(list));
	}
}
