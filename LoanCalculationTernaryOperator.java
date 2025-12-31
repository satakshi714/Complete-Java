public class LoanCalculationTernaryOperator {
    public static void main(String[] args) {

        double P = 500000;
        double R = 10;
        int T = 5;
        double SI = (P > 0 && R > 0 && T > 0) ? (P * R * T) / 100 : 0;
        System.out.println("Q11: " + SI);
    }
}
