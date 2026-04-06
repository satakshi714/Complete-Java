import java.util.Scanner;
public class CompanyBonusEligibilityControlStatement {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Years of experience");
        int experience = sc.nextInt();
        System.out.println("Performance Rating: ");
        int rating = sc.nextInt();
        if(experience >= 5 && rating >= 4){
            System.out.println("Employee gets a bonus!!!!");
        }else{
            System.out.println("Not eligible for bonus");
        }
        sc.close();
    }
}
