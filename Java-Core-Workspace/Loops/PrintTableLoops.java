import java.util.Scanner;
public class PrintTableLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         int num = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= 10; i++){
            result *= num;
            System.out.println(num + " * " + i + " = " + result);
        }
        sc.close();
    }
    
}
