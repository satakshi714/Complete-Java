import java.util.stream.*;
import java.util.*;
public class StormUtility {
	public double calculateTotalRainfall(Stream<Storm> storms) {
		return storms.mapToDouble(Storm::getRainfall).sum();
	}
	public Stream<Storm> findMostIntenseStorm(List<Storm> storms){
		return storms.stream()
		.sorted((s1,s2)->Double.compare(
				(s2.getRainfall() + s2.getWindSpeed()),
				(s1.getRainfall() + s1.getWindSpeed())
				))
		.limit(1);
	}
	public double calculateAverageWindSpeed(List<Storm> storms) {
		return storms.stream().mapToDouble(Storm::getWindSpeed).average().orElse(0.0);
	}
}
