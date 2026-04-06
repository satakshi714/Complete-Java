import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SearchEngineUtility util = new SearchEngineUtility();
        List<SearchEngine> list = new ArrayList<>();

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-mm-yyyy");

        System.out.println("Enter the number of search engines");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the search engine details");

        for(int i=0;i<n;i++){
            String[] parts = sc.nextLine().split(",");

            SearchEngine s = new SearchEngine(
                    parts[0],
                    parts[1],
                    Double.parseDouble(parts[2]),
                    parts[3],
                    LocalDate.parse(parts[4],formatter)
            );

            list.add(s);
        }
        Map<String, SearchEngine> map =
                util.categorySearchEngine(list.stream());

        System.out.println("Search engines grouped by category");

        map.forEach((k,v) ->
                System.out.println(k + " " + v));

        
        System.out.println("Enter the value of n");
        int top = Integer.parseInt(sc.nextLine());

        System.out.println("Top " + top + " search engines by rating");

        util.getTopNSearchEnginesByRating(list,top)
                .forEach(s -> System.out.println(s.getEngineName()
                        + " / " + s.getRating()));

        
        System.out.println("Most recently created search engine");
        System.out.println(util.findTheMostRecentlyCreatedSearchEngine(list.stream()));
    }
}
