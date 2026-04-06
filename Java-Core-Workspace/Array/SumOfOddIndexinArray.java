import java.util.Scanner;
public class SumOfOddIndexinArray {
    
    public static void main(System[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 != 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
        sc.close();

    }
}

    
