public class LoginAlertTernaryOperator {
    public static void main(String[] args) {

        int attempts = 4;
        boolean locked = false;
        String alert = attempts < 3 && locked ? "Login successful" : "ALERT";
        System.out.println("Q21: " + alert);
    }
    
}
