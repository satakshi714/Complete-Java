import java.util.Scanner;
public class ArrayPrograms {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr1[] = new int[5];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        sc.close();
    }
}
