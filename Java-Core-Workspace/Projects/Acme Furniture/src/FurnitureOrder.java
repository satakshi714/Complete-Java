import java.util.*;
public class FurnitureOrder {
	private Set<String> orderSet = new HashSet<>();

	public Set<String> getOrderSet() {
		return orderSet;
	}

	public void setOrderSet(Set<String> orderSet) {
		this.orderSet = orderSet;
	}
	public FurnitureOrder() {
		
	}
	public void addOrderDetails(String furnitutreDetails){
		orderSet.add(furnitutreDetails);
	}
	public int findCountOfCustomersBasedOnTheFurniture(String furniture) {
		int count = 0;
		for(String order : orderSet) {
			String parts[] = order.split(":");
			String furniturePart = parts[1];
			if(furniturePart.equalsIgnoreCase(furniture)) {
				count++;
			}
		}
		if(count == 0) {
			 return -1;
		}
		return count;
	}
	public List<String> getCustomerNamesByFurniture(String furniture){
		List<String> customer = new ArrayList<>();
		for(String order : orderSet) {
			String parts[] = order.split(":");
			String cutomerName = parts[0];
			String furnitureName = parts[1];
			if(furnitureName.equalsIgnoreCase(furniture)) {
				customer.add(cutomerName);
			}
		}
		return customer;
	}
	public String getFurnitureByCustomerName(String customerName) {
		for(String order: orderSet) {
			String parts[] = order.split(":");
			String customer = parts[0];
			String furnitureName = parts[1];
			if(customer.equalsIgnoreCase(customerName)) {
				return furnitureName;
			}
		}
		return null;
	}
	
}
