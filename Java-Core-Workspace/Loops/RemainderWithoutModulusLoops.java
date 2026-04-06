import java.util.Scanner;
public class RemainderWithoutModulusLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        while(dividend > divisor){
            dividend = dividend - divisor;
        }
        System.out.println(dividend);

        sc.close();
    }
}
