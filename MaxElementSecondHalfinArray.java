import java.util.Scanner;
public class MaxElementSecondHalfinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[n-1];
        for(int i = n/2; i < n ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        sc.close();
    }  
}
