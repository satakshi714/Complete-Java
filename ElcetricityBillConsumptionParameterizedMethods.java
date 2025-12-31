import java.util.Scanner;

public class ElcetricityBillConsumptionParameterizedMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current units: ");
        double units = sc.nextDouble();
        System.out.print("Enter previous units: ");
        double prevUnit = sc.nextDouble();
        double currUnit = units - prevUnit;
        System.out.println(bill(currUnit));
        sc.close();
    } 
    public static String bill(double units){
        double price = 0;
        if(units <= 0){
            return "Invalid unit value";
        }
        if(units <= 100){
            return "Units are free";
        }else if(units > 100 && units <= 250){
            price = (units * 3.5);
        }else{
            price = units * 6.5;
        }
        return "Bill Amount " + price;
    }
    
}
