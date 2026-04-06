public class DiscountTernaryOperator {
    public static void main(String[] args) {

        boolean isPremiumMember = false;
        int cartVal= 7999;
        String discount = (isPremiumMember == true || cartVal > 5000) ? "Customer gets a discount" : "Customer is not eligible for discount";
        System.out.println("Q16: " + discount);
    }
    
}
