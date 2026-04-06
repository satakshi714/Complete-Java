
public class Tool {
	String name;
	String category;
	String manufacturer;
	int quantity;
	double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	Tool(){
		
	}
	public Tool(String name, String category, String manufacturer, int quantity, double price) {
		super();
		this.name = name;
		this.category = category;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
		this.price = price;
	}
	
	
}
