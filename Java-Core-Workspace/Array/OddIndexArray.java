import java.util.Scanner;

public class OddIndexArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Printing even index
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
