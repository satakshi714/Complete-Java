import java.util.Scanner;
public class switchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Q1. Calculator-------------------------------------------------------
        System.out.println("Enter an operand(+,-,*,/): ");
        char operand = sc.next().charAt(0);
        int a = 0, b = 0;
        switch(operand){
            case '+':
                System.out.println("Enter 2 integers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a+b);
                break;
            case '-':
                System.out.println("Enter 2 integers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a+b);
                System.out.println(a-b);
                break;
            case '*':
                System.out.println("Enter 2 integers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a+b);
                System.out.println(a*b);
                break;
            case '/':
                System.out.println("Enter 2 integers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a+b);
                if(b!= 0){
                    System.out.println(a/b);
                }else{
                    System.out.println("Divisor is zero");
                }
                break;
        }

        // Q2. Day Based Worked Schedule---------------------------------------------------
        // System.out.println("Enter Day of the week(1-7): ");
        // int day = sc.nextInt();
        // switch (day){
        //     case 1: 
        //         System.out.println("Weekday");
        //         break;
        //     case 2: 
        //         System.out.println("Weekday");
        //         break;
        //     case 3: 
        //         System.out.println("Weekday");
        //         break;
        //     case 4: 
        //         System.out.println("Weekday");
        //         break;
        //     case 5: 
        //         System.out.println("Weekday");
        //         break;
        //     case 6: 
        //         System.out.println("Weekend");
        //         break;
        //     case 7: 
        //         System.out.println("Weekend");
        //         break;
        // }

        // Q3. ATM Operation Selection--------------------------------------------------------
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

        // Q4. Movie Rating System
        // System.out.println("Enter a rating \n 1 -  2, 3, 4): ");
        // int rating = sc.nextInt();
        // switch(rating){
        //     case 1: System.out.println("Poor");
        //     break;
        //     case 2: System.out.println("Average");
        //     break;
        //     case 3: System.out.println("Good");
        //     break;
        //     case 4: System.out.println("Excellent");
        //     break;
        // }

        // 

        sc.close();
    }
}
