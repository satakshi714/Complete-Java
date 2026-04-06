import java.util.Scanner;
public class AverageOfFirstHalfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0, avg = 0, c = 0;
        for(int i = 0; i < arr.length/2; i++){
            sum += arr[i];
            c++;
        }
        
        avg = sum/c;
        System.out.println(avg);
        sc.close();

    }
}
