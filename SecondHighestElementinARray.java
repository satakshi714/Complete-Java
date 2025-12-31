import java.util.Scanner;
public class SecondHighestElementinARray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int secondHigh = 0;
        int arr[] = new int[n];
        int max = arr[0];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                secondHigh = max;
                max = arr[i];
            }else if(arr[i] < max && secondHigh < arr[i]){
                secondHigh = arr[i];
            }
        }
        System.out.println(secondHigh);
        sc.close();
    }
}
