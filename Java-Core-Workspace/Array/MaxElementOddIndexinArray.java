import java.util.Scanner;
public class MaxElementOddIndexinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[1];
        for(int i = 3; i < n; i+=2){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}
