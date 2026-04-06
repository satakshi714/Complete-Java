import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int n = sc.nextInt();
		sc.nextLine(); 
		if(n < 1) {
			System.out.println(" The number of strings must be greater than zero");
			return;
		}
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		int len = arr[0].length();
		for(int i = 1; i < n; i++) {
			if(arr[i].length() != len) {
				System.out.println("All strings are not of the same length");
				return;
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		for(int col = 0 ; col < len; col++) {
			boolean upper = true;
			boolean lower = true;
			for(int row = 0; row < n; row++) {
				char ch = arr[row].charAt(col);
				if(!Character.isUpperCase(ch)) {
					upper = false;
				}
				if(!Character.isLowerCase(ch)) {
					lower = false;
				}
			}
			if(upper || lower) {
				result.add(col + 1);
			}
		}
		if(!result.isEmpty()) {
			for(int pos : result) {
				System.out.print(pos+" ");
			}
		}
	}
}
