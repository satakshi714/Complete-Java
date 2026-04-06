package home;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Apartment {
	private Map<String, Double> apartmentDetailsMap = new HashMap<>();
	
	public Map<String, Double> getApartmentDetailsMap(){
		return apartmentDetailsMap;
	}
	public void setApartmentDetailsMap(Map<String, Double> apartmentDetailsMap) {
		this.apartmentDetailsMap = apartmentDetailsMap;
	}
	
	public void addApartmentDetails (String apartmentNumber, double rent) {
		apartmentDetailsMap.put(apartmentNumber, rent);
	}
	public double findTotalRentOfApartmentInGivenrange(double minimumRent, double maximumRent) {
		double total = 0.0;
		for(Map.Entry<String,Double> entry : apartmentDetailsMap.entrySet()) {
			double rent = entry.getValue();
			if(rent >=minimumRent && rent <=maximumRent) {
				total+=rent;
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Apartment obj = new Apartment();
		System.out.println("Enter no: ");
		int n  = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] parts = input.split(":");
			String apartmentNumber = parts[0];
			Double rent = Double.parseDouble(parts[1]);
			obj.addApartmentDetails(apartmentNumber, rent);
		}
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double total = obj.findTotalRentOfApartmentInGivenrange(a, b);
		System.out.println(total);
		
	}
}
