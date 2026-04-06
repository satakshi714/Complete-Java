public class DiscountEligibilityTernaryOperator {
    public static void main(String[] args) {

        int discountCartValue = 2100;
        String discountResult = (discountCartValue > 2000) ? "Discount applied" : "No discount";
        System.out.println("Q4: " + discountResult);
    }

}
