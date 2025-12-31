public class PriceDropNotificationTernaryOperator {
    public static void main(String[] args) {
        int currentPrice = 900;
        int lastViewedPrice = 1000;
        String priceDropResult = (currentPrice < lastViewedPrice) ? "Notify user" : "No notification";
        System.out.println("Q6: " + priceDropResult);
    }
}
