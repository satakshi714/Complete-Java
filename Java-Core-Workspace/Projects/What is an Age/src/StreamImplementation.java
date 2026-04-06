import java.util.*;
import java.util.stream.Collectors;

public class StreamImplementation {
	public static int sumAge(List<Person> list) {
		return list.stream().filter(p -> p.getAge() > 50).mapToInt(o -> o.getAge()).sum();
	}
	public static List<String> printName(List<Person> list){
		return list.stream().map(p -> p.getName()).collect(Collectors.toList());
	}
	public static List<Integer> printAge(List<Person> list){
		return list.stream().map(p->p.getAge()).collect(Collectors.toList());
	}
}
