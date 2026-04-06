import java.util.Scanner;
public class NumbersExceptFiveLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for(int i = m; i <= n; i++){
            int temp = i;
            boolean isFive = false;
            while(temp > 0){
                if(temp % 10 == 5){
                    isFive = true;
                }
                temp /= 10;
            }
            if(!isFive){
                System.out.println(i);
            }
        }
        sc.close();
    }
    
}
