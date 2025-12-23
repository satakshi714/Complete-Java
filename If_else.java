import java.util.Scanner;
public class If_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Q1. Online Cab Booking Validation--------------------------------------------------------
        // System.out.println("Enter Location: ");
        // String location = sc.nextLine();
        // System.out.println("Is the location servicable(yes/no): ");
        // String isLocation = sc.next();
        // sc.nextLine();
        // System.out.println("Driver name: ");
        // String driver = sc.nextLine();
        // System.out.println("Is driver available in that location: ");
        // String isAvailable = sc.next();
        // System.out.println("Enter payment method(card/cash/upi): ");
        // String payment = sc.next();
        // if(payment != null && isLocation.equals("yes") && isAvailable.equals("yes")){
        //     System.out.println("Our driver " + driver+ " is accepting the ride for "+ location);
        //     if(payment.equals("card") || payment.equals("cash") || payment.equals("upi")){
        //         System.out.println("Payment method selected: "+ payment);
        //     }
        // }else{
        //     System.out.println("Cab is not available");
        // }

        //Q2.  Employee Attendance System--------------------------------------------------------
        // System.out.println("Enter the employees working hours: ");
        // int workingHours = sc.nextInt();
        // if(workingHours >= 8){
        //     System.out.println("Employee is present");
        // }else if(workingHours >=4 && workingHours <= 8){
        //     System.out.println("Half Day");
        // }else{
        //     System.out.println("Employee is absent");
        // }

        //Q3. Bank account Status check-----------------------------------------------------------
        // System.out.println("is the account flagged(yes/no): ");
        // String isFlagged = sc.next();
        // if(isFlagged.equals("no")){
        //     System.out.println("Set minimum balace: ");
        //     int minBalance = sc.nextInt();
        //     System.out.println("Enter current balance: ");
        //     int currentBalance = sc.nextInt();
        
        //     if(currentBalance >= minBalance){
        //         System.out.println("Account is active");
        //     }else{
        //         System.out.println("Low balance");
        //     }
        // }else{
        //     System.out.println("Frozen Account");
        // }

        // Q4. Online Course Access-----------------------------------------------------------
        // System.out.println("Enter course price: ");
        // int price = sc.nextInt();
        // System.out.println("Does the student have schorlarship(yes/no): ");
        // String scholarship = sc.next();
        // System.out.println("Is the course expired(yes/no): ");
        // String expired = sc.next();
        // if(expired.equals("no")){
        //     if(price != 0 || scholarship.equals("yes")){
        //         System.out.println("Student can access the course");
        //     }else{
        //         System.out.println("Student can not access the course");
        //     }
        // }else{
        //     System.out.println("Course is expired");
        // }

        // Q5. Railway Ticket COnfirmation---------------------------------------------------
        // System.out.println("Number of availabe seats: ");
        // int seatCount = sc.nextInt();
        // System.out.println("Is RAC seats available(yes/no): ");
        // String isRAC = sc.next();
        // if(seatCount > 0){
        //     System.out.println("Your ticket is confirmed: ");
        // }else if(seatCount <=0 && isRAC.equals("yes")){
        //     System.out.println("Seats are waitlisted");
        // }else{
        //     System.out.println("No seats availabe");
        // }

        // Q6. Shoppin Cart Validation\
        // System.out.println("Enter delivery address");
        // String deliveryAddress = sc.nextLine();
        // System.out.println("Is this delivery address valid(yes/no): ");
        // String isValidAddress = sc.next();
        // if(isValidAddress.equals("yes")){
        //     System.out.println("Delivery available for "+ deliveryAddress);
        //     System.out.println("Enter cart value: ");
        //     int cartValue = sc.nextInt();
        //     if(cartValue > 0){
        //         System.out.println("Checkout cart");
        //     }else{
        //         System.out.println("Cart value not sufficient");
        //     }
        // }else{
        //     System.out.println("Not eligibe for checkout at this location");
        // }
        
        // Q7. COmpany Bonus Eligibility----------------------------------------------------------
        // System.out.println("Years of experience");
        // int experience = sc.nextInt();
        // System.out.println("Performance Rating: ");
        // int rating = sc.nextInt();
        // if(experience >= 5 && rating >= 4){
        //     System.out.println("Employee gets a bonus!!!!");
        // }else{
        //     System.out.println("Not eligible for bonus");
        // }

        // Q8. Exam Result Classification----------------------------------------------------------------------
        // System.out.println("Enter marks: ");
        // int marks = sc.nextInt();
        // if(marks >= 40){
        //     System.out.println("Student passed the exam.");
        //     if(marks >= 80){
        //         System.out.println("Student recieved Grade A!!");
        //     }else if(marks <= 79 && marks > 60){
        //         System.out.println("Student recieved Grade B!");
        //     }
        // }else{
        //     System.out.println("Student falied the exam.");
        // }


        sc.close();
    }
}
