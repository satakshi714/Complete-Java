import java.util.*;
public class Source {
	public static int sum(ArrayList<Integer> numbers) {
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		return sum;
	}
	public static ArrayList<Integer> splitAndReverse(ArrayList<Integer> list){
		ArrayList<Integer> res = new ArrayList<>();
		int pivot = 0;
		if(list.size() % 2 != 0) {
			pivot = (list.size() + 1)/2;
		}else {
			pivot = list.size()/2;
		}
		for(int i = pivot-1; i >= 0; i--) {
			res.add(list.get(i));
		}
		for(int i = list.size()-1; i >= pivot; i--) {
			res.add(list.get(i));
		}
		return res;
	}
	public static Integer getItemAtIndex(ArrayList<Integer> list, int index){
		if(index < 0 || index> list.size()) {
			return null;
		}
		return list.get(index);
	}
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(73);
		numbers.add(24);
		numbers.add(01);
		numbers.add(15);
		numbers.add(5);
		System.out.println(sum(numbers));
		System.out.println(getItemAtIndex(numbers, 2));
		System.out.println(splitAndReverse(numbers));
	}

}
