
public class CarRental {
	String name;
	int age;
	String phoneNumber;
	String licenseNumber;
	String carType;
	String fuelType;
	int numberOfDays;
	int distance;
	CarRental(){
		
	}
	public boolean validateUserDetails(int age, String phoneNumber, String licenseNumber) throws InvalidRentalDetailsException{
		
		if(age < 18) {
			throw new InvalidRentalDetailsException("Invalid age");
		}
		if(!phoneNumber.matches("\\d{10}")) {
			throw new InvalidRentalDetailsException("Invalid phone number");
		}
		if(!licenseNumber.matches("[A-Z]{5}\\d{3}")) {
			throw new InvalidRentalDetailsException("Invalid license number");
		}
		return true;
	}
	public boolean validateCarDetails(String carType, String fuelType) throws InvalidRentalDetailsException{
		if(!(carType.equals("SUV") || carType.equals("Sedan") || carType.equals("Hatchback"))) {
			throw new InvalidRentalDetailsException("Invalid car type");
		}
		if(!(fuelType.equals("Petrol") || fuelType.equals("Diesel") || fuelType.equals("Electric"))) {
			throw new InvalidRentalDetailsException("Invalid fuel type");
		}
		return true;
	}
	public boolean validateDaysAndDistance(int numberOfDays, int distance) throws InvalidRentalDetailsException{
		if(numberOfDays <= 0) {
			throw new InvalidRentalDetailsException("Invalid number of days");
		}
		if(distance < 10) {
			throw new InvalidRentalDetailsException("Invalud distance");
		}
		return true;
	}
	public double calculateRentalCost(String carType, String fuelType, int numberOfDays, int distance) {
		double base = 0;
		double dist = 0;
		
		if(carType.equals("SUV")) {
			base = 1500;
		}else if(carType.equals("Sedan")){
			base = 1100;
		}else {
			base = 800;
		}
		if(carType.equals("SUV")) {
			if(fuelType.equals("Petrol")) dist = 25.5;
			else if(fuelType.equals("Diesel")) dist = 23.5;
			else dist = 19.5;
		}
		else if(carType.equals("Sedan")) {
			if(fuelType.equals("Petrol")) dist = 22;
			else if(fuelType.equals("Diesel")) dist = 20;
			else dist = 16;
		}
		else {
			if(fuelType.equals("Petrol")) dist = 21;
			else if(fuelType.equals("Diesel")) dist = 19;
			else dist = 15;
		}
		return (base * numberOfDays) + (distance * dist);
	}
	
}

































