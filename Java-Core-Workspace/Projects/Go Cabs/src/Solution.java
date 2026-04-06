	import java.util.*;
	public class Solution {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			CarRental cr = new CarRental();
			try {
				System.out.println("Enter Name");
				String name = sc.nextLine();
				System.out.println("Enter Age");
				int age = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Phone Number");
				String phoneNumber = sc.nextLine();
				System.out.println("Enter License Number");
				String licenseNumber = sc.nextLine();
				
				cr.validateUserDetails(age, phoneNumber, licenseNumber);
				
				System.out.println("Select Car Type");
				String carType = sc.nextLine(); 
				System.out.println("Select Fuel Type");
				String fuelType = sc.nextLine();
				
				cr.validateCarDetails(carType, fuelType);
				
				System.out.println("Enter Number of Days");
				int numberOfDays = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Distance to be Travelled");
				int distance = Integer.parseInt(sc.nextLine());
				
				cr.validateDaysAndDistance(numberOfDays, distance);
				
				double cost = cr.calculateRentalCost(carType, fuelType, numberOfDays, distance);
				System.out.println("Total Rental Cost "+ cost);
			}catch(InvalidRentalDetailsException e) {
				System.out.println(e.getMessage());
			}
		}
	}
