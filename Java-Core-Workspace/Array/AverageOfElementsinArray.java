import java.util.Scanner;
public class AverageOfElementsinArray {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int avg = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = sum /n;
        System.out.println(avg);

        sc.close();
    }

}
