import java.util.Scanner;
import java.util.Arrays;
public class ReplaceAnElementinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int idx = sc.nextInt();
        int ele = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(i == idx){
                arr[i] = ele;
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
