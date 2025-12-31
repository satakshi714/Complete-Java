import java.util.Scanner;
public class ProductOfEvenOddLoops {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int product = 1;
        for(int i = num1; i <= num2; i++){
                product *= i;
        }
        System.out.println(product);
        sc.close();
    }

}
