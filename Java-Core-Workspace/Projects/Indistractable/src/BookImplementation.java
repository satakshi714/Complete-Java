import java.util.*;
import java.util.stream.Collectors;
public class BookImplementation {
	public String getNameOfBooks(List<Book> books) {
		return books.stream().map(i-> i.getBookName()+" "+ i.getBookCost()).collect(Collectors.joining(", "));
	}
	public int sumCostOfAllBooks(List<Book> books) {
		return books.stream().map(i->i.getBookCost()).reduce(0,(a,b) -> a+b);
	}
	public int getMax(List<Book> books) {
		return books.stream().mapToInt(i->i.getBookCost()).max().orElse(0);
	}
}
