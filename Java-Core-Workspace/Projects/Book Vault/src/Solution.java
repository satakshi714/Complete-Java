import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Library l = new Library();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of records to be added");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the records (ISBN:Genre)");
		for(int i = 0; i < n; i++) {
			String bookDetails = sc.nextLine();
			l.addBookDetails(bookDetails);
		}
		
		System.out.println("Enter the genre to be searched");
		String genre = sc.nextLine();
		int count = l.findCountOfBooksBasedOnGenre(genre);
		if(count == -1) System.out.println("No books were found for "+ genre);
		else System.out.println("The books based on "+genre+" are "+count);
		
		System.out.println("Enter the Genre to identify the iSBNs");
		String gen = sc.nextLine();
		List<String> isbns = l.findISBNsBasedOnGenre(gen);
		if(isbns.isEmpty()) {
			System.out.println("No ISBNs were found for "+gen);
		}else {
			System.out.println("ISBNs based on the "+gen+" are ");
			for(String i : isbns) {
				System.out.println(i);
			}
		}
		
		System.out.println("Enter the ISBN to find the genre");
		String g = sc.nextLine();
		String is = l.findGenreByISBN(g);
		if(is.isEmpty()) System.out.println("No genre found for ISBN "+ g);
		else System.out.println("The genre for "+g+" is "+ is);
		
	}
}
