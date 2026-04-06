package Project_EmployeeManagementSystem;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();
        int choice;

        System.out.println("Welcome to Employee Management System");

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee by ID");
            System.out.println("6. Count Employees by Department");
            System.out.println("7. Exit");

            System.out.print("\nChoose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.addEmployee(sc);
                    break;
                case 2:
                    manager.displayEmployees();
                    break;
                case 3:
                    manager.updateEmployee(sc);
                    break;
                case 4:
                    manager.deleteEmployee(sc);
                    break;
                case 5:
                    manager.searchEmployee(sc);
                    break;
                case 6:
                    manager.countByDepartment(sc);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 7);
    }
}
