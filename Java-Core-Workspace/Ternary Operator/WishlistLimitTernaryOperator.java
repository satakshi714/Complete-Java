public class WishlistLimitTernaryOperator {
     public static void main(String[] args) {

        int wishlistCount = 100;
        String wishlistResult = (wishlistCount < 100) ? "Item added" : "Wishlist full";
        System.out.println("Q10: " + wishlistResult);
     }
    
}
