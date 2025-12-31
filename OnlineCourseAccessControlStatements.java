import java.util.Scanner;
public class OnlineCourseAccessControlStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter course price: ");
        int price = sc.nextInt();
        System.out.println("Does the student have schorlarship(yes/no): ");
        String scholarship = sc.next();
        System.out.println("Is the course expired(yes/no): ");
        String expired = sc.next();
        if(expired.equals("no")){
            if(price != 0 || scholarship.equals("yes")){
                System.out.println("Student can access the course");
            }else{
                System.out.println("Student can not access the course");
            }
        }else{
            System.out.println("Course is expired");
        }
        sc.close();
    }
    
}
