import java.util.Scanner;
public class CalculatorSwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an operand(+,-,*,/): ");
        char operand = sc.next().charAt(0);
        int a = 0, b = 0;
        switch(operand){
            case '+':
                System.out.println("Enter 2 integers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a+b);
                break;
            case '-':
                System.out.println("Enter 2 integers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a+b);
                System.out.println(a-b);
                break;
            case '*':
                System.out.println("Enter 2 integers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a+b);
                System.out.println(a*b);
                break;
            case '/':
                System.out.println("Enter 2 integers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a+b);
                if(b!= 0){
                    System.out.println(a/b);
                }else{
                    System.out.println("Divisor is zero");
                }
                break;
        }
        sc.close();
    }
}
