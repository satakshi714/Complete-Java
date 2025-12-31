public class JobApplicationTernaryOperator {
    public static void main(String[] args) {

        int yearsOfExp = 3;
        boolean projectExp = false;
        boolean graduated = true;
        String eligible = ((yearsOfExp >= 2 || projectExp) && graduated) ? "Applicant is eligible" : "Applicant is not eligible";
        System.out.println("Q20: " + eligible);
    }
}
