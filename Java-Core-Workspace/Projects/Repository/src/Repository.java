
class Repository {
	public static String getCountryName(String countryCode)throws InvalidCodeException{
		int x = Integer.parseInt(countryCode);
		if(x >= 70 && x <= 99) return "India";
		else if(x == 908) return "US";
		else if(x == 001) return "Dial somewhere outside US";
		else throw new InvalidCodeException("No coutry with the given code found");
	}
	
}
