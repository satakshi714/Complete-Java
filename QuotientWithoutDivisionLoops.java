import java.util.Scanner;
public class QuotientWithoutDivisionLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int quotient = 0;
        while(dividend >= divisor){
            dividend = dividend - divisor;
            quotient++;
        }
        System.out.println(quotient);

        sc.close();
    }
}
