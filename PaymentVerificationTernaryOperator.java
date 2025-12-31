public class PaymentVerificationTernaryOperator { 
    public static void main(String[] args) {

        double paidAmount = 1999.99;
        double orderAmount = 1999.99;
        String paymentResult = (paidAmount == orderAmount) ? "Payment successful" : "Payment mismatch";
        System.out.println("Q7: " + paymentResult);

    }
}
