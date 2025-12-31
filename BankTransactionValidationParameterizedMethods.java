import java.util.Scanner;

public class BankTransactionValidationParameterizedMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        double bal = sc.nextDouble();
        System.out.print("Enter withdrawl amount: ");
        double withd = sc.nextDouble();
        System.out.println(transcation(bal, withd));
        sc.close();
    }
    public static String transcation(double bal, double withd){
        if(withd <= bal){
            return "Proceed with withdrawl";
        }
        return "Invalid Amount";
    }
    
}
