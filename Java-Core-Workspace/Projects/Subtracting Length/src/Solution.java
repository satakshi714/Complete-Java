import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		int n = s.length();
		if(n  <4) {
			System.out.println("The string "+s+" has minimum length");
			return;
		}
		if(s.contains(" ")) {
			System.out.println("The string "+s+" should not contain space");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append((char)(s.charAt(i) - n));
		}
		System.out.println(sb.toString());
	}
}
