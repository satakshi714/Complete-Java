import java.util.Scanner;
public class BankAccountStatusCheckControlStatements {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("is the account flagged(yes/no): ");
        String isFlagged = sc.next();
        if(isFlagged.equals("no")){
            System.out.println("Set minimum balace: ");
            int minBalance = sc.nextInt();
            System.out.println("Enter current balance: ");
            int currentBalance = sc.nextInt();
        
            if(currentBalance >= minBalance){
                System.out.println("Account is active");
            }else{
                System.out.println("Low balance");
            }
        }else{
            System.out.println("Frozen Account");
        }
        sc.close();
    }
}
