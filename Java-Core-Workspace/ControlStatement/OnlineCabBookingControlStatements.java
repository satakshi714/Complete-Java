import java.util.Scanner;
public class OnlineCabBookingControlStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Location: ");
        String location = sc.nextLine();
        System.out.println("Is the location servicable(yes/no): ");
        String isLocation = sc.next();
        sc.nextLine();
        System.out.println("Driver name: ");
        String driver = sc.nextLine();
        System.out.println("Is driver available in that location: ");
        String isAvailable = sc.next();
        System.out.println("Enter payment method(card/cash/upi): ");
        String payment = sc.next();
        if(payment != null && isLocation.equals("yes") && isAvailable.equals("yes")){
            System.out.println("Our driver " + driver+ " is accepting the ride for "+ location);
            if(payment.equals("card") || payment.equals("cash") || payment.equals("upi")){
                System.out.println("Payment method selected: "+ payment);
            }
        }else{
            System.out.println("Cab is not available");
        }
        sc.close();
    }
}