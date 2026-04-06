import java.util.*;
public class Solution {
	public static void main(String[] args) {
		List<Book> b = new ArrayList<>();
		b.add(new Book("Sapiens", 550));
		b.add(new Book("Indistractabe", 400));
		b.add(new Book("Dancer", 100));
		b.add(new Book("Lincoln", 250));
		BookImplementation bi = new BookImplementation();
		System.out.println(bi.getNameOfBooks(b));
		System.out.println(bi.sumCostOfAllBooks(b));
		System.out.println(bi.getMax(b));
	}
}
