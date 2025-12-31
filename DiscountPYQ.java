import java.util.Scanner;
public class DiscountPYQ {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        int totalCost = quantity * 100;
        double discount = 0;
        if(totalCost <1000 ){
            System.out.println("Discount not applicatble");
        }else{
            discount = 0.1 * totalCost;
            double value = totalCost - discount;
            System.out.println("Your total after discount is " + value);
        }
        sc.close();
    }
}
