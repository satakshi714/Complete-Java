public class ReturnPolicyValidation {
     public static void main(String[] args) {

        int daysSinceDelivery = 9;
        String returnResult = (daysSinceDelivery <= 7) ? "Return accepted" : "Return rejected";
        System.out.println("Q9: " + returnResult);

     }
}
