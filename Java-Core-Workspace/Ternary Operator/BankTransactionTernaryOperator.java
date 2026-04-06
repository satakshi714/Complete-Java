public class BankTransactionTernaryOperator {
    public static void main(String[] args) {

        boolean balanceSufficient = false;
        boolean isActive = true;
        String transaction = balanceSufficient && isActive ? "Transaction Permitted" : "Not Permitted";
        System.out.println("Q23: " + transaction);
    }
}
