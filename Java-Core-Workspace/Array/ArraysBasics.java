import java.util.Arrays;
import java.util.Scanner;
public class ArraysBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        int arr[] = new int[sc.nextInt()];

        // Read input from user
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // print the elements
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
