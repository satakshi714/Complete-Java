import java.util.Scanner;

public class LoginAuthenticationSystemParameterizedMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username =sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        System.out.println(auth(username,password));
        sc.close();
    }
    public static String auth(String username, String password){
        if(username.equals("Satakshi") && password.equals("qwerty123")){
            return "Valid Credentials";
        }else{
            return "Invalid Credentials";
        }
    }
    
}
