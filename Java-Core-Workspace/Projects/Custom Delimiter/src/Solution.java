import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(s1.length() < 3 || s1.length() > 150) {
			System.out.println("Invalid String length");
			return;
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(!s1.contains(s2)) {
			System.out.println("Delimiter not found");
			return;
		}
		
		
	}
}
