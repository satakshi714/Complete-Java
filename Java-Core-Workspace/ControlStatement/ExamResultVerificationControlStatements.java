import java.util.Scanner;
public class ExamResultVerificationControlStatements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks: ");
        int marks = sc.nextInt();
        if(marks >= 40){
            System.out.println("Student passed the exam.");
            if(marks >= 80){
                System.out.println("Student recieved Grade A!!");
            }else if(marks <= 79 && marks > 60){
                System.out.println("Student recieved Grade B!");
            }
        }else{
            System.out.println("Student falied the exam.");
        }


        sc.close();
    }
}
