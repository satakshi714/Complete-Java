import java.util.*;
public class AccountMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        long accNo = sc.nextLong();
        System.out.print("Enter IFSC code: ");
        String ifsc = sc.next();
        System.out.print("Enter account type(current/savings): ");
        String type = sc.next();
        System.out.print("Enter current balance: ");
        double current = sc.nextDouble();
        System.out.println("Select a process \n1. Withdraw \n2. Deposit \n3. Display Details \n4. Exit");
        int choice = sc.nextInt();
        double amt = 0;
        switch(choice){
            case 1:{
                System.out.print("Enter amount to withdraw: ");
                amt = sc.nextDouble();
                if(withdraw(amt, current)){
                    System.out.println("Withdrawl of amount "+amt+" successful.");
                }else{
                    System.out.println("Invalid Amount Entered");
                }
            }
            break;
            case 2:{
                System.out.print("Enter amount to deposit: ");
                amt = sc.nextDouble();
                System.out.print("Enter account number of the transferring account: ");
                long account = sc.nextLong();
                if(deposit(amt, current)){
                    System.out.println(amt +"Amount deposited to "+ account);
                }else{
                    System.out.println("Invalid Amount Entered");
                }
            }break;
            case 3:{
                System.out.println("Account Number: " + accNo);
                System.out.println("IFSC Code: " + ifsc);
                System.out.println("Account Type: "+ type);
                System.out.println("Current Balance: " + current);

            }break;
            case 4: {
                System.out.print("Exiting");
            }break;
            default:{
                System.out.println("Invalid Input");
            }
        }
        sc.close();
    }
    public static boolean withdraw(double amt, double current){
        if(amt > 0 && amt < current && (current - amt) > 500 && amt <= 50000){
            current -= amt;
            return true;
        }else{
            return false;
        }
    }
    public static boolean deposit(double amt, double current){
        if(amt > 0 && amt <= 100000){
            return true;
        }else{
            return false;
        }
    }
}
