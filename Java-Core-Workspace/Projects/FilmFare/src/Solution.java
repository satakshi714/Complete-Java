
public class Solution {
	public static void main(String[] args) throws MovieRatingException{
		Rating r = new Rating(9,5);
		Validator v = new Validator();
		System.out.println(v.canBeConsideredForTheAward(r));
		System.out.println(v.sendInvite(r));
	}
}
