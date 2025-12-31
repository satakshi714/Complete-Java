public class MobileAppFeaturesTernaryOperator {
    public static void main(String[] args) {

        boolean loggedIn = false;
        boolean tnc = true;
        String enabled = loggedIn && tnc ? "Feature Enabled" : "Feature not enabled";
        System.out.println("Q25: " + enabled);
    }
}
