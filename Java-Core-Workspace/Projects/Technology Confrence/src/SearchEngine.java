import java.time.LocalDate;

public class SearchEngine {
	String engineName;
	String url;
	double rating;
	String category;
	LocalDate dateCreated;
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	SearchEngine(){
		
	}
	public SearchEngine(String engineName, String url, double rating, String category, LocalDate dateCreated) {
		super();
		this.engineName = engineName;
		this.url = url;
		this.rating = rating;
		this.category = category;
		this.dateCreated = dateCreated;
	}
	@Override
	public String toString() {
		return "SearchEngine [engineName=" + engineName + ", url=" + url + ", rating=" + rating + ", category="
				+ category + ", dateCreated=" + dateCreated + "]";
	}
	
}
