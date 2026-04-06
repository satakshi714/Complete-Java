
class RepositoryImplementation {
	public static String getCountry(String countryCode) throws InvalidCodeException{
		int len = countryCode.length();
		if(len > 3 || len < 2) throw new InvalidCodeException("Invalid Code Detail Found");
		else return Repository.getCountryName(countryCode);
	}
}
