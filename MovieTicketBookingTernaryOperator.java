public class MovieTicketBookingTernaryOperator {
    public static void main(String[] args) {

        boolean seatsAvail = true;
        boolean membership = true;
        boolean promoCode = false;
        String booking = ((promoCode || membership) && seatsAvail) ? "Ticket booked" : "Not booked";
        System.out.println("Q22: " + booking);
    }
}
