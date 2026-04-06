package cake;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CakeOrder {
	private Map<String, Double> orderMap = new HashMap<>();
	
	public Map<String, Double> getOrderMap(){
		return orderMap;
	}
	public void setOrderMap(Map<String, Double> orderMap) {
		this.orderMap = orderMap;
	}
	
	public void addOrderDetails(String orderId, double cakeCost) {
		orderMap.put(orderId, cakeCost);
	}
	public Map<String, Double> findOrdersAboveSpecifiedCost(double cakeCost){
		Map<String, Double> result = new HashMap<>();
		for(Map.Entry<String, Double> entry : orderMap.entrySet()) {
			if(entry.getValue() > cakeCost) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		if(result.isEmpty()) {
				System.out.println("No cake orders found");
			
		}
		return result;	
	}
	public static void main(String[] args) {
		CakeOrder obj = new CakeOrder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i< n; i++) {
			String order = sc.nextLine();
			String[] parts = order.split(":");
			String orderId = parts[0];
			Double cost = Double.parseDouble(parts[1]);
			obj.addOrderDetails(orderId, cost);
		}
		double cakeCost = sc.nextDouble();
        Map<String, Double> result = obj.findOrdersAboveSpecifiedCost(cakeCost);
        for (Map.Entry<String, Double> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
	}
	
}
