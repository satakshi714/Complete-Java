import java.util.*;
public class Library {
	private Set<String> bookSet = new HashSet<>();
	public void setBookSet(Set<String> bookSet) {
		this.bookSet = bookSet;
	}
	public Set<String> getBookSet(){
		return bookSet;
	}
	Library(){
		
	}
	public void addBookDetails(String bookDetails) {
		bookSet.add(bookDetails);
	}
	public int findCountOfBooksBasedOnGenre(String genre) {
		int count = 0;
		for(String record : bookSet) {
			String parts[] = record.split(":");
			if(parts[1].equalsIgnoreCase(genre)) {
				count++;
			}
		}
		if(count == 0) {
			return -1;
		}else {
			return count;
		}
	}
	public List<String> findISBNsBasedOnGenre(String genre){
		List<String> result = new ArrayList<>();
		for(String record: bookSet) {
			String parts[] = record.split(":");
			if(parts[1].equalsIgnoreCase(genre)) {
				result.add(parts[0]);
			}
		}
		return result;
	}
	public String findGenreByISBN(String ISBN) {
		String res = "";
		for(String record : bookSet) {
			String parts[] = record.split(":");
			if(parts[0].equalsIgnoreCase(ISBN)) {
				res = parts[1];
			}
		}
		return res;
	}
}























