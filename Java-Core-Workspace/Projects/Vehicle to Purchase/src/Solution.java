import java.util.*;
public class Solution {
	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle("Alfa Romeo", 760000.0));
		list.add(new Vehicle("Bugatti", 9500.0));
		list.add(new Vehicle("Chrysley", 790000.0));
		list.add(new Vehicle("Dodge", 80000.0));
		VehicleImplementation v = new VehicleImplementation();
		System.out.println(v.sumOfPrices(list));
		System.out.println(v.getVehicleList(list));
		System.out.println(v.maxPrice(list));
	}
}
