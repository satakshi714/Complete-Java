import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class ToolUtility {
	public Map<String, List<Tool>> retrieveToolsGroupedByCategory(Stream<Tool> tools){
		return tools.collect(Collectors.groupingBy(Tool::getCategory));
	}
	public Map<String, Double> getManufacturersAndPriceByToolName(Stream<Tool> tools,String toolName){
		return tools
				.filter(t->t.getName().equals(toolName))
				.collect(Collectors.toMap(
						Tool::getManufacturer,
						Tool::getPrice,
						(p1,p2) -> p2
					));
	}
	public Stream<String> generateSummaryReport(List<Tool> tools){
		int totalTools = tools.size();
		double price = tools.stream()
						.mapToDouble(Tool::getPrice).sum();
		int quantity = tools.stream()
						.mapToInt(Tool::getQuantity).sum();
		return Stream.of(
				"Total tools:"+totalTools+
				"Total price:"+price+
				"Total quantity: "+quantity
				);
	}
}
