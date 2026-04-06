import java.util.Scanner;
public class ExamResultAnalyserParameterizedMethods {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maths marks: ");
        int maths = sc.nextInt();
        System.out.print("Enter science marks: ");
        int science = sc.nextInt();
        System.out.print("Enter english marks: ");
        int english = sc.nextInt();
        String results = (eligible(maths, science, english));
        System.out.println(results);
        if(results.equals("F") || results.equals("D") || results.equals("C")){
            System.out.println("Not Eligible for placements");
        }else{
            System.out.println("Eligible for placements");
        }
        sc.close();
    }
    public static String eligible(int maths, int science, int english){
        int avg = (maths + science + english)/3;
        if(avg >= 90){
            return "A";
        }else if(avg >= 75 && avg < 90){
            return "B";
        }else if(avg >= 65 && avg < 75){
            return "C";
        }else if(avg >= 55 && avg < 65){
            return "D";
        }else{
            return "F";
        }
    }
}
