import java.util.Scanner;
public class PrimeNumbersinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int temp = arr[i];
            if(isPrime(temp)){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
    public static boolean isPrime(int m){
        if(m <= 1){
            return false;
        }
        for(int i = 2; i <= m/2; i++){
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }
}
