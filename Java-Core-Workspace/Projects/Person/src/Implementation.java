import java.util.regex.*;

public class Implementation {
	public String validator(Person details) throws InvalidDateException, InvalidEmailException{
		String s[] = details.dob.split("-");
		if(!(Integer.parseInt(s[2]) < 2000)) {
			throw new InvalidDateException("Date year must be less than 2000");
		}
		if(!Pattern.matches("^[A-Za-z0-9+_._]+@doselect.com$",  details.email)) {
			throw new InvalidEmailException("Only @doselect.com domains are allowed");
		}
		return "Valid details";
	}
	public String submitDetails(Person details) {
		try {
			validator(details);
			return "Details submitted successfully";
		}catch (InvalidDateException e) {
			return "Invalid details";
		}catch(InvalidEmailException e) {
			return "Invalid details";
		}catch(Exception e) {
			return "Other Exception";
		}
	}
}
