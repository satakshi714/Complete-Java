
import java.util.Scanner;
public class SumOfEvenOddLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        for(int i = num1; i <= num2; i++){
                sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
