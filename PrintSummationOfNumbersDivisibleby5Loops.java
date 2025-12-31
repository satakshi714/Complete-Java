import java.util.Scanner;
public class PrintSummationOfNumbersDivisibleby5Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // print summation of the numbers which are divisible by 5-------------------------------
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        for(int i = n1; i <= n2; i++){
            if(i % 5 == 0)
                sum += i;
        }
        System.out.println(sum);

        sc.close();
    }
}
