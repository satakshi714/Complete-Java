
public class Validator {
	public String eligible(Candidate details) throws CriteriaMismatchException{
		if(details.totalRating < 1000) {
			throw new CriteriaMismatchException("Minimum 1000 rating is required");
		}
		if(details.totalContest < 10) {
			throw new CriteriaMismatchException("Minimum 100 contest is required");
		}
		return "Eligible Candidate";
	}
	public String sendInvite(Candidate details) throws CriteriaMismatchException{
		try {
			eligible(details);
			return "Invitation send";
		}catch(CriteriaMismatchException e) {
			return "Candidate not eligible";
		}catch (Exception e) {
			return "Other Exception";
		}
	}
}
