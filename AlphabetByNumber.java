import java.util.Scanner;
public class AlphabetByNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
            result = 64 + num;
        System.out.println((char)result);
        sc.close();
    }
    
}
