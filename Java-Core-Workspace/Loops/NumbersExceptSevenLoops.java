import java.util.Scanner;
public class NumbersExceptSevenLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            int temp = i;
        boolean isSeven = false;
            while(temp > 0){
                if(temp % 10 == 7){
                    isSeven = true;
                    break;
                }
                temp /= 10;
            }
            if(!isSeven){
                System.out.println(i);
            }
        }

        sc.close();
    }   
}
