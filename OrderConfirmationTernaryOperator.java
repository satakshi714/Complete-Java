public class OrderConfirmationTernaryOperator {
    public static void main(String[] args) {

        boolean pay = true;
        boolean stockAvail = true;
        boolean backorder = false;
        String confirm = ((stockAvail || backorder) && pay) ? "Order Confirmed" : "Not confirmed";
        System.out.println("Q19: " + confirm);
    }
    
}
