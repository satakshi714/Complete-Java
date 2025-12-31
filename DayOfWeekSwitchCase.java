import java.util.Scanner;
public class DayOfWeekSwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day of the week(1-7): ");
        int day = sc.nextInt();
        switch (day){
            case 1: 
                System.out.println("Weekday");
                break;
            case 2: 
                System.out.println("Weekday");
                break;
            case 3: 
                System.out.println("Weekday");
                break;
            case 4: 
                System.out.println("Weekday");
                break;
            case 5: 
                System.out.println("Weekday");
                break;
            case 6: 
                System.out.println("Weekend");
                break;
            case 7: 
                System.out.println("Weekend");
                break;
        }
        sc.close();
    }
}
