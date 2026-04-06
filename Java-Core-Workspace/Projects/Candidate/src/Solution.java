
public class Solution {
	public static void main(String[] args) throws CriteriaMismatchException{
		Candidate c = new Candidate("Steve", 1020, 20);
		Validator v = new Validator();
		System.out.println(v.eligible(c));
		System.out.println(v.sendInvite(c));
	}
}
