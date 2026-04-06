import java.util.Scanner;
public class ATMSwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Select an operation \n 1 - Withdraw \n 2 - Deposit \n 3 - Balance Enquiry \n 4 - Exit");
        int op = sc.nextInt();
        int amount = 0;
        int currentBalance = 10000;
        int balance = 0;
        switch(op){
            case 1:{
                System.out.println("Add amount to withdraw");
                amount = sc.nextInt();
                balance = currentBalance -= amount;
                if(amount > 0 && amount <= currentBalance && amount <= 5000 && balance > 500){
                    System.out.println(amount + " withdrawn");
                    currentBalance -= amount;
                }else{
                    System.out.println("Amount cannot be withdrawn.");
                }
            }
            break;
            case 2:{
                System.out.println("Enter account number: ");
                String number = sc.next();
                System.out.println("Add amount to deposit");
                amount = sc.nextInt();
                if(amount > 0 && number.length() == 10){
                    System.out.println(amount + " deposited");
                    currentBalance += amount;
                }
                else{
                    System.out.println("Deposit Failed, Check account number");
                }
            }
            break;
            case 3:{
                System.out.println("Balance enquiry");
                System.out.println("Current Balance is: " + currentBalance);
            }
            break;
            case 4:{
                System.out.println("Exiting");
            }
            break;
        }
        sc.close();
    }
    
}
