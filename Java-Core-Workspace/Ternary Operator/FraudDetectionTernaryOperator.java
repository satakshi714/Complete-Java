public class FraudDetectionTernaryOperator {
    public static void main(String[] args) {
        int orderAmountValue = 15000;
        int averageOrderValue = 8000;
        String fraudResult = (orderAmountValue > averageOrderValue) ? "Flag for review" : "Normal order";
        System.out.println("Q8: " + fraudResult);
    }
}
