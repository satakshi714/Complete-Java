public class TernaryOperator {
    public static void main(String[] args) {

         //Q1. Stock Availability
        int stock = 10;
        String stockResult = (stock > 0) ? "Can add to cart" : "Out of stock";
        System.out.println("Q1: " + stockResult);


         //Q2. Quantity Limit
        int quantity = 6;
        String quantityResult = (quantity <= 5) ? "Order allowed" : "Quantity limit exceeded";
        System.out.println("Q2: " + quantityResult);


         // Q3. Free Delivery Rule
        int cartValue = 499;
        String deliveryResult = (cartValue >= 499) ? "Free delivery" : "Delivery charges apply";
        System.out.println("Q3: " + deliveryResult);


         // Q4. Discount Eligibility
        int discountCartValue = 2100;
        String discountResult = (discountCartValue > 2000) ? "Discount applied" : "No discount";
        System.out.println("Q4: " + discountResult);


         // Q5. Coupon Expiry Validation
        int currentDate = 10;
        int expiryDate = 15;
        String couponResult = (currentDate < expiryDate) ? "Coupon valid" : "Coupon expired";
        System.out.println("Q5: " + couponResult);


         // Q6. Price Drop Notification
        int currentPrice = 900;
        int lastViewedPrice = 1000;
        String priceDropResult = (currentPrice < lastViewedPrice) ? "Notify user" : "No notification";
        System.out.println("Q6: " + priceDropResult);


         // Q7. Payment Verification
        double paidAmount = 1999.99;
        double orderAmount = 1999.99;
        String paymentResult = (paidAmount == orderAmount) ? "Payment successful" : "Payment mismatch";
        System.out.println("Q7: " + paymentResult);


         // Q8. Fraud Detection Check
        int orderAmountValue = 15000;
        int averageOrderValue = 8000;
        String fraudResult = (orderAmountValue > averageOrderValue) ? "Flag for review" : "Normal order";
        System.out.println("Q8: " + fraudResult);


         // Q9. Return Policy Validation
        int daysSinceDelivery = 9;
        String returnResult = (daysSinceDelivery <= 7) ? "Return accepted" : "Return rejected";
        System.out.println("Q9: " + returnResult);


         //Q10. Wishlist Limit
        int wishlistCount = 100;
        String wishlistResult = (wishlistCount < 100) ? "Item added" : "Wishlist full";
        System.out.println("Q10: " + wishlistResult);


        //Q11. Loan Rules – Loan Calculation
        double P = 500000;
        double R = 10;
        int T = 5;
        double SI = (P > 0 && R > 0 && T > 0) ? (P * R * T) / 100 : 0;
        System.out.println("Q11: " + SI);


        //Q.12 Check whether input is character, number or string
        char ch='*';
        boolean uc=ch>='A'&&ch<='Z';
        boolean lc=ch>='a'&&ch<='z';
        boolean dig=ch>=0&&ch<=9;
        boolean alp=uc||lc;
        boolean ucv=ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
        boolean lcv=ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';

        String res = (alp ?"alphabet : "+ (uc? "uppercase : " +(ucv? "vowel":"consonant"):"lowercase : "+(lcv?"vowel":"consonant")):(dig?"digit":"special char"));
        System.out.println("Q12: " + res);


        //Q13. Username and Password
        String username = "abv ";
        String password = " qwerty12";
        String login = (username != " " && password != " ") ? "Login successful" : "Please enter username or password";
        System.out.println("Q13: " + login);


        //Q14. Exam Attendance
        int attendance = 65;
        boolean feesPaid = true;
        boolean medicalCertificate = true;
        String allowed = ((attendance > 75 || medicalCertificate == true) && feesPaid == true) ? "Student is allowed" : "Student is not allowed";
        System.out.println("Q14: " + allowed);


        //Q15. Employee
        boolean id = true;
        boolean permanentEmployee = true;
        boolean contract = false;
        String emp = ((permanentEmployee == true || contract == true) && id == true) ? "Employee can enter" : "Employee cannot enter";
        System.out.println("Q15: " + emp);


        // Q16. Discount
        boolean isPremiumMember = false;
        int cartVal= 7999;
        String discount = (isPremiumMember == true || cartVal > 5000) ? "Customer gets a discount" : "Customer is not eligible for discount";
        System.out.println("Q16: " + discount);


        // Q17 Unstable server
        int CPUusage = 60;
        int memoryUsage = 92;
        String server = CPUusage < 85 || memoryUsage  < 90 ? "Server stable" : "Server Unstable";
        System.out.println("Q17: "+ server);


        // Q18. User Access
        int userAge = 16;
        boolean banned = false;
        String access = (userAge > 18 && banned == false) ? "USer can access the application" : "User cannot access the application";
        System.out.println("Q18: " + access);


        // Q19 Order confirmation
        boolean pay = true;
        boolean stockAvail = true;
        boolean backorder = false;
        String confirm = ((stockAvail || backorder) && pay) ? "Order Confirmed" : "Not confirmed";
        System.out.println("Q19: " + confirm);


        // Q20 Job Applicant
        int yearsOfExp = 3;
        boolean projectExp = false;
        boolean graduated = true;
        String eligible = ((yearsOfExp >= 2 || projectExp) && graduated) ? "Applicant is eligible" : "Applicant is not eligible";
        System.out.println("Q20: " + eligible);


        // Q21 Login alert
        int attempts = 4;
        boolean locked = false;
        String alert = attempts < 3 && locked ? "Login successful" : "ALERT";
        System.out.println("Q21: " + alert);


        // Q22 Movie Ticket Booking
        boolean seatsAvail = true;
        boolean membership = true;
        boolean promoCode = false;
        String booking = ((promoCode || membership) && seatsAvail) ? "Ticket booked" : "Not booked";
        System.out.println("Q22: " + booking);


        // Q23 Bank Transaction
        boolean balanceSufficient = false;
        boolean isActive = true;
        String transaction = balanceSufficient && isActive ? "Transaction Permitted" : "Not Permitted";
        System.out.println("Q23: " + transaction);


        // Q24 Candidate test
        boolean logicRound = true;
        boolean codingRound = false;
        boolean referral = false;
        String  test = (referral || (logicRound && codingRound)) ? "Candidate Passed" : "Candidate did not pass";
        System.out.println("Q24: " + test);


        // Q25 Mobile app feature
        boolean loggedIn = false;
        boolean tnc = true;
        String enabled = loggedIn && tnc ? "Feature Enabled" : "Feature not enabled";
        System.out.println("Q25: " + enabled);


        // Q26 System backup
        boolean midnight = false;
        String serverLoad = "high";
        boolean maintenanceMode = true;
        String backup = ((serverLoad == "low" || maintenanceMode) && midnight) ? "Run system backup" : "Don't run backup";
        System.out.println("Q26: " + backup);


        // Q27 Student Placement
        int backlog = 0;
        double GPA = 7.5;
        boolean internship = false;
        String placed = ((GPA > 6 || internship) && backlog == 0) ? "Student Qualified" : "Student not Qualified";
        System.out.println("Q27: " + placed);
    }
}
