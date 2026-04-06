
public class Validator {
	public String canBeConsideredForTheAward(Rating rating) throws MovieRatingException{
		if(rating.imdbRating < 7) {
			throw new MovieRatingException("Movie not eligible for FIlmFare award");
		}
		if(rating.nominee < 4) {
			throw new MovieRatingException("Minimum 4 nominee required");
		}
		return "Considered for the award";
	}
	public String sendInvite(Rating rating) throws MovieRatingException{
		try {
			canBeConsideredForTheAward(rating);
			return "Actors and Directors Invited";
		}catch(MovieRatingException e) {
			return "Not Invited";
		}catch(Exception e) {
			return "Other Exception";
		}
	}
}
