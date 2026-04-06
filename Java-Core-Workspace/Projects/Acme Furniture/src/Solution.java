import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FurnitureOrder fo = new FurnitureOrder();
		System.out.println("Enter number of records to be added");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the records (Customer Name: Furniture");
		for(int i = 0; i < n; i++) {
			String records = sc.nextLine();
			fo.addOrderDetails(records);
		}
		System.out.println("Enter the Furniture to be searched");
		String s = sc.nextLine();
		int count = fo.findCountOfCustomersBasedOnTheFurniture(s);
		if(count == -1) {
			System.out.println("No order were found for "+ s);
		}else {
			System.out.println("The Order based on "+s+" are "+count);
		}
		
		System.out.println("Enter the Furniture to identify the Customer Names");
		String s1 = sc.nextLine();
		List<String> customer = fo.getCustomerNamesByFurniture(s);
		if(customer.isEmpty()) {
			System.out.println("No customer names were found for "+s1);
		}else {
			System.out.print("Customer names based on "+s1+" are ");
		
			for(String name : customer) {
				System.out.println(name);
			}
		}
		System.out.println("Enter the Customer name to find the Furniture purchased");
		String name = fo.getFurnitureByCustomerName(s);
		String s2 = sc.nextLine();
		if(name == null) {
			System.out.println("No furniture for "+ s2);
		}else {
			System.out.println("Furniture purchased by "+s2+" is "+ name);
		}
		
	}
}
