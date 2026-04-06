import java.util.*;
import java.util.stream.Stream;
public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ToolUtility util = new ToolUtility();
		List<Tool> tools = new ArrayList<>();
		System.out.println("Enter the number of the tools you want to add");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the details of the tools");
		for(int i = 0; i < n; i++) {
			String parts[] = sc.nextLine().split(":");
			Tool t = new Tool();
			t.setName(parts[0]);
			t.setCategory(parts[1]);
			t.setManufacturer(parts[2]);
			t.setQuantity(Integer.parseInt(parts[3]));
			t.setPrice(Double.parseDouble(parts[4]));
			tools.add(t);
		}
		Map<String, List<Tool>>  s1 = util.retrieveToolsGroupedByCategory(tools.stream());
		System.out.println("Tools grouped by category");
		s1.forEach((category, toolList)->{
			System.out.println(category);
			toolList.forEach(t->
					System.out.println(t.getName()+" "+ t.getQuantity()+" "+t.getPrice()));
		});
		
		System.out.println("Enter tool name to get manufacturers and prices");
		String toolName = sc.nextLine();
		Map<String, Double> s2 = util.getManufacturersAndPriceByToolName(tools.stream() ,toolName);
		if(s2.isEmpty()) {
			System.out.println("");
		}else {
			System.out.println("Manufacturers and prices of "+ toolName);
			s2.forEach((m,p)->System.out.println(m+" "+p));
		}
		System.out.println("Summary Report");
		util.generateSummaryReport(tools)
				.forEach(System.out::println);
		
	}
}
