import java.util.Scanner;

public class GradeEvaluationSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maths = sc.nextInt();
        int eng = sc.nextInt();
        int science = sc.nextInt();

        int sum = maths + eng + science;
        int avg = sum / 3;

        char grade;

        if (avg >= 90)
            grade = 'A';
        else if (avg >= 75)
            grade = 'B';
        else if (avg >= 60)
            grade = 'C';
        else if (avg >= 40)
            grade = 'D';
        else
            grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Excellent performance");
                break;
            case 'B':
                System.out.println("Very good performance");
                break;
            case 'C':
                System.out.println("Good performance");
                break;
            case 'D':
                System.out.println("Average performance");
                break;
            case 'F':
                System.out.println("Fail needs improvement");
                break;
            default:
                System.out.println("Invalid grade");
        }

        sc.close();
    }
}
