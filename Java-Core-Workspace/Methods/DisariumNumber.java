import java.util.*;
public class DisariumNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        // for(int i = 1; i <= 500; i++){
            if(isDisarium(i)){
                System.out.println("Disarium number");
            }else{
                System.out.println("Not disarium");
            }
        // }
        sc.close();
    } 
    public static boolean isDisarium(int n){
        int len = count(n);
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int rev = temp % 10;
            sum += power(rev, len);
            len--;
            temp /= 10;
        }
        // System.out.println(sum);
        return sum == n;
    }
    public static int power(int base, int exp){
        int result = 1;
        for(int i = 0; i < exp; i++){
            result *= base;
        }
        return result;

    }
    public static int count(int n){
        int count = 0;
        while(n > 0){ 
            n /= 10;
            count++;
        }
        return count;

    }
}
