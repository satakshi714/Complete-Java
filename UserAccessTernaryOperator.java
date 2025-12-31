public class UserAccessTernaryOperator {
    public static void main(String[] args) {

        int userAge = 16;
        boolean banned = false;
        String access = (userAge > 18 && banned == false) ? "USer can access the application" : "User cannot access the application";
        System.out.println("Q18: " + access);
    }
}
