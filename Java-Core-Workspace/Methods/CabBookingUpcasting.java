import java.util.Scanner;
public class CabBookingUpcasting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter contact: ");
        long contactNumber = sc.nextLong();
        while(true){
            System.out.println("Choose a cab:\n1. Mini\n2. Prime.\n3. Luxury");
            int choice = sc.nextInt();
            Ola ola = null;
            switch (choice) {
                case 1:
                    ola = new Mini();
                    break;
                case 2:
                    ola = new Prime();
                    break;
                case 3:
                    ola = new Luxury();
                    break;
                case 4:
                    System.out.println("Thank you for using Ola 🚕");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            ola.login(username, contactNumber);
            ola.setUberBalance(1000);
            sc.nextLine();

            System.out.print("Enter pickup location: ");
            String pickup = sc.nextLine();
            System.out.print("Enter drop location: ");
            String drop = sc.nextLine();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            if (ola.getUberBalance() < price) {
               System.out.println("Insufficient Balance. Please recharge.");
                continue;
            }

            System.out.println("1. Confirm Ride");
            System.out.println("2. Cancel Ride");
            int action = sc.nextInt();

            switch (action) {
                case 1: 
                    switch (choice){
                        case 1: 
                            Mini m = (Mini) ola;
                            m.bookCab(pickup, drop, price);
                            m.displayDetails();
                            break;
                    
                        case 2:
                            Prime p = (Prime) ola;
                            p.bookCab(pickup, drop, price);
                            p.displayDetails();
                            break;
            
                        case 3:
                            Luxury l = (Luxury) ola;
                            l.bookCab(pickup, drop, price);
                            l.displayDetails();
                            break;
                    }
                    break;
                case 2:
                    switch(choice){
                        case 1:
                            ((Mini)ola).cancelRide();
                            break;
                            case 2:
                            ((Prime)ola).cancelRide();
                            break;
                            case 3:
                            ((Luxury)ola).cancelRide();
                            break;
                    }
                    continue;
                default:
                    System.out.println("Invalid choice");

            }
            double currentBalance = ola.getUberBalance() - price;
            System.out.println("Wallet Balance: " + currentBalance);
        }
        
    }
}

class Ola{
    public String username;
    public long contactNumber;
    private double uberBalance;

    public void setUberBalance(double amount){
        this.uberBalance = amount;
    }
    public double getUberBalance(){
        return uberBalance;
    }
    public void login(String username, long contactNumber){
        this.username = username;
        this.contactNumber = contactNumber;
        System.out.println("Login Successful");
    }
}

class Mini extends Ola{
    private String pickup;
    private String drop;
    private double price;

    public void bookCab(String pickup, String drop, double price){
        this.pickup = pickup;
        this.drop = drop;
        this.price = price;
        
    }
    public void displayDetails(){
        System.out.println("Mini Ride from "+pickup+" to "+ drop+". Price: "+ price);
    }
    public void cancelRide(){
        System.out.println("Mini Ride Cancelled");
    }
}

class Prime extends Ola{
    private String pickup;
    private String drop;
    private double price;

    public void bookCab(String pickup, String drop, double price){
        this.pickup = pickup;
        this.drop = drop;
        this.price = price;
        
    }
    public void displayDetails(){
        System.out.println("Prime Ride from "+pickup+" to "+ drop+". Price: "+ price);
    }
    public void cancelRide(){
        System.out.println("Prime Ride Cancelled");
    }
}

class Luxury extends Ola{
    private String pickup;
    private String drop;
    private double price;

    public void bookCab(String pickup, String drop, double price){
        this.pickup = pickup;
        this.drop = drop;
        this.price = price;
        
    }
    public void displayDetails(){
        System.out.println("Luxury Ride from "+pickup+" to "+ drop+". Price: "+ price);
    }
    public void cancelRide(){
        System.out.println("Luxury Ride Cancelled");
    }
}
