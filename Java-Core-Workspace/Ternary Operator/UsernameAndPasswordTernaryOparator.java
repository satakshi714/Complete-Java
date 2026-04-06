public class UsernameAndPasswordTernaryOparator {
    public static void main(String[] args) {

        String username = "abv ";
        String password = " qwerty12";
        String login = (username != " " && password != " ") ? "Login successful" : "Please enter username or password";
        System.out.println("Q13: " + login);
    }
    
}
