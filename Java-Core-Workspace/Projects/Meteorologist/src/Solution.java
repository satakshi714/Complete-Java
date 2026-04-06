import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StormUtility su = new StormUtility();
		List<Storm> storm = new ArrayList<>();
		System.out.println("Enter the number of Storms:");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enetr the details of each storm");
		for(int i = 0 ; i < n; i++) {
			Storm s = new Storm();
			String details[] = sc.nextLine().split(":");
			s.setWindSpeed(Double.parseDouble(details[0]));
			s.setRainfall(Double.parseDouble(details[1]));
			s.setDate(details[2]);
			s.setLocation(details[3]);
			s.setType(details[4]);
			storm.add(s);
		}
		System.out.println("Total Rainfall: "+ su.calculateTotalRainfall(storm.stream()));
		System.out.println("Most Intense Storm:");
		su.findMostIntenseStorm(storm)
			.forEach(s->System.out.println(
					"Location: "+ s.getLocation()+
					", Type: "+ s.getType()
			));
		System.out.println("Average wind speed: "+su.calculateAverageWindSpeed(storm));
	}
}
