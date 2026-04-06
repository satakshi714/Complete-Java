import java.util.Scanner;
public class PalindromeNumbersinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int temp = arr[i];
            int rev = 0;
            while(temp != 0){
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }
            if(arr[i] == rev){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
