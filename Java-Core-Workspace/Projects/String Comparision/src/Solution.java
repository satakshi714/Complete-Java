import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(!isValid(s1) || !isValid(s2)) {
			System.out.println("Input strings must contain only alphabets, numbers, and spaces");
			return;
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		String result = longestSubstring(s1, s2);
		if(result.length() == 0) {
			System.out.println("No common substring found");
		}else {
			System.out.println(result.length());
			System.out.println(result);
		}
		
	}
	public static boolean isValid(String s) {
		return s.matches("[a-zA-Z0-9 ]*");
	}
	public static String longestSubstring(String s1, String s2) {
		String longest = "";
		for(int i = 0; i < s1.length(); i++) {
			if(s1.length() - i < longest.length())
				break;
			for(int j = 0; j < s2.length(); j++) {
				int x = i;
				int y = j;
				StringBuilder sb = new StringBuilder();
				while(x < s1.length() && y < s2.length() && s1.charAt(x) == s2.charAt(y)) {
					sb.append(s1.charAt(x));
					x++;
					y++;
				}
				if(sb.length() > longest.length()) {
					longest = sb.toString();
				}
			}
		}
		return longest;
	}
}
