import java.util.*;
import java.util.stream.*;
public class SearchEngineUtility {
	public Map<String, SearchEngine> categorySearchEngine(Stream<SearchEngine> searchEngine){
		return searchEngine.collect(Collectors.toMap(
				SearchEngine::getCategory,
				se->se, 
				(oldValue, newValue)-> newValue
				));
	}
	public Stream<SearchEngine> getTopNSearchEnginesByRating(List<SearchEngine> searchEngine, int n){
		return searchEngine.stream()
			.sorted(Comparator.comparingDouble(SearchEngine::getRating).reversed())
			.limit(n);
	}
	public String findTheMostRecentlyCreatedSearchEngine(Stream<SearchEngine> searchEngine) {
		Optional<SearchEngine> latest = searchEngine.max(Comparator.comparing(SearchEngine::getDateCreated));
		if(latest.isPresent()) {
			SearchEngine s = latest.get();
			return s.getEngineName()+" "+ s.getDateCreated();
		}
		return "";
	}
}
