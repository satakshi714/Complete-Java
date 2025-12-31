public class EmployeeTernaryOperator {
    public static void main(String[] args) {

        boolean id = true;
        boolean permanentEmployee = true;
        boolean contract = false;
        String emp = ((permanentEmployee == true || contract == true) && id == true) ? "Employee can enter" : "Employee cannot enter";
        System.out.println("Q15: " + emp);
    }
}
