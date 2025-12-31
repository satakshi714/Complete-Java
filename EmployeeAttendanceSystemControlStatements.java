import java.util.Scanner;
public class EmployeeAttendanceSystemControlStatements {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employees working hours: ");
        int workingHours = sc.nextInt();
        if(workingHours >= 8){
            System.out.println("Employee is present");
        }else if(workingHours >=4 && workingHours <= 8){
            System.out.println("Half Day");
        }else{
            System.out.println("Employee is absent");
        }
        sc.close();
    }
}
