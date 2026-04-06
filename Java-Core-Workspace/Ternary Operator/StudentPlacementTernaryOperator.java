public class StudentPlacementTernaryOperator {
    public static void main(String[] args) {

        int backlog = 0;
        double GPA = 7.5;
        boolean internship = false;
        String placed = ((GPA > 6 || internship) && backlog == 0) ? "Student Qualified" : "Student not Qualified";
        System.out.println("Q27: " + placed);
    }
}
