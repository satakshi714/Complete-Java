
public class Storm {
	double windSpeed;
	double rainfall;
	String date;
	String location;
	String type;
	public double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public double getRainfall() {
		return rainfall;
	}
	public void setRainfall(double rainfall) {
		this.rainfall = rainfall;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Storm() {
	}
	public Storm(double windSpeed, double rainfall, String date, String location, String type) {
		super();
		this.windSpeed = windSpeed;
		this.rainfall = rainfall;
		this.date = date;
		this.location = location;
		this.type = type;
	}
	
}
