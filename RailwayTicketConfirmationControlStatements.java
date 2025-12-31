import java.util.Scanner;
public class RailwayTicketConfirmationControlStatements {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of availabe seats: ");
        int seatCount = sc.nextInt();
        System.out.println("Is RAC seats available(yes/no): ");
        String isRAC = sc.next();
        if(seatCount > 0){
            System.out.println("Your ticket is confirmed: ");
        }else if(seatCount <=0 && isRAC.equals("yes")){
            System.out.println("Seats are waitlisted");
        }else{
            System.out.println("No seats availabe");
        }
        sc.close();
    }
    
}
