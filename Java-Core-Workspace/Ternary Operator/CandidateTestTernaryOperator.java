public class CandidateTestTernaryOperator {
    public static void main(String[] args) {

        boolean logicRound = true;
        boolean codingRound = false;
        boolean referral = false;
        String  test = (referral || (logicRound && codingRound)) ? "Candidate Passed" : "Candidate did not pass";
        System.out.println("Q24: " + test);
    }
}
