package Project_EmployeeManagementSystem;
import java.util.Scanner;

public class EmployeeManager {
    private Employee[] employees = new Employee[20];
    private int count = 0;
    public void addEmployee(Scanner sc){
        if(count == employees.length){
            System.out.println("Employee storage full!");
            return;
        }
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        Employee temp = new Employee(id, "", "", 0);
        for(int i = 0; i < count; i++){
            if(employees[i].equals(temp)){
                System.out.println("Employee with ID "+id+" already exists! Cannot add duplicate.");
                return;
            }
        }
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        employees[count++] = new Employee(id, name, department, salary);
        System.out.println("Employee added successfully!\n");
        System.out.println("Current Employees:");
        displayEmployees();
    }
    public void displayEmployees(){
        if(count == 0){
            System.out.println("No employee found.");
            return;
        }
        for(int i = 0; i < count; i++){
            System.out.println((i + 1) + ". " + employees[i]);
        }
    }
    public void updateEmployee(Scanner sc){
        System.out.println("Enter Employee ID to update: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                sc.nextLine();
                System.out.print("Enter new Name: ");
                employees[i].setName(sc.nextLine());
                System.out.print("Enter new Department: ");
                employees[i].setDepartment(sc.nextLine());
                System.out.print("Enter new Salary: ");
                employees[i].setSalary(sc.nextDouble());

                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }
    public void deleteEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Found Employee:");
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void countByDepartment(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter department to count: ");
        String dept = sc.nextLine();
        int deptCount = 0;

        for (int i = 0; i < count; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(dept)) {
                deptCount++;
            }
        }

        System.out.println("Number of employees in " + dept + ": " + deptCount);
    }
}
