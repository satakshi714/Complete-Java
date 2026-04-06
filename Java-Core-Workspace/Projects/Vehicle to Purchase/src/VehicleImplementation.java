import java.util.*;
import java.util.stream.Collectors;
public class VehicleImplementation {
	public Double sumOfPrices(List<Vehicle> list) {
		return list.stream().map(i->i.getPrice()).mapToDouble(i->i).sum();
	}
	public List<String> getVehicleList(List<Vehicle> list){
		return list.stream().filter(i-> i.getPrice()>25000).map(i->i.getName()).collect(Collectors.toList());
	}
	public Double maxPrice(List<Vehicle> list) {
		return list.stream().map(i->i.getPrice()).reduce(Double.MIN_VALUE, Double::max);
	}
}
