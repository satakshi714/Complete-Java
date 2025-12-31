public class StockAvailabilityTernaryOperator {
    public static void main(String[] args) {

        int stock = 10;
        String stockResult = (stock > 0) ? "Can add to cart" : "Out of stock";
        System.out.println("Q1: " + stockResult);
    }
}
