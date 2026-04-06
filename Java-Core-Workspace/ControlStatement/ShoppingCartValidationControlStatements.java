import java.util.Scanner;
public class ShoppingCartValidationControlStatements {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter delivery address");
        String deliveryAddress = sc.nextLine();
        System.out.println("Is this delivery address valid(yes/no): ");
        String isValidAddress = sc.next();
        if(isValidAddress.equals("yes")){
            System.out.println("Delivery available for "+ deliveryAddress);
            System.out.println("Enter cart value: ");
            int cartValue = sc.nextInt();
            if(cartValue > 0){
                System.out.println("Checkout cart");
            }else{
                System.out.println("Cart value not sufficient");
            }
        }else{System.out.println("Not eligibe for checkout at this location");
        }
           
        sc.close();
    }    
}
