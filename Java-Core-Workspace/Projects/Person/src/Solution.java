
public class Solution {
	public static void main(String[] args) throws InvalidDateException, InvalidEmailException {
		Person data = new Person("Steve", "12-02-1998", "steve@doselect.com");
		Implementation i = new Implementation();
		System.out.println(i.validator(data));
		System.out.println(i.submitDetails(data));
	}
}
