import java.util.Scanner;

public class OnlineShoppingDiscountEngineParameterizedMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter customer type(Regular/Premium): ");
        String type = sc.next();
        System.out.println(discount(amount, type));
        sc.close();
    }
    public static String discount(double amount, String type){
        double regDiscount = 0.1;
        double preDiscount = 0.2;
        double totalPrice = 0;
        if(type.equals("Regular") && amount >= 4999){
            totalPrice = amount - (amount * regDiscount);
        }else if(type.equals("Premium") && amount >= 1999){
            totalPrice = amount - (amount * preDiscount);
        }else{
            return "Not eligible for discount your total value is "+ amount;
        }
        return "Your amount after discount is "+ totalPrice;
    }
    
}
