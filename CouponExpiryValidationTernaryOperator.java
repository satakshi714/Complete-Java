public class CouponExpiryValidationTernaryOperator {
    public static void main(String[] args) {

        int currentDate = 10;
        int expiryDate = 15;
        String couponResult = (currentDate < expiryDate) ? "Coupon valid" : "Coupon expired";
        System.out.println("Q5: " + couponResult);
    }
    
}
