public class ExamAttendanceTernaryOperator {
    
    public static void main(String[] args) {

        int attendance = 65;
        boolean feesPaid = true;
        boolean medicalCertificate = true;
        String allowed = ((attendance > 75 || medicalCertificate == true) && feesPaid == true) ? "Student is allowed" : "Student is not allowed";
        System.out.println("Q14: " + allowed);
    }
}
