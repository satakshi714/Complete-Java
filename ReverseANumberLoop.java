import java.util.Scanner;
public class ReverseANumberLoop {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        int num = 0;
        while(i >0){
           num = num*10+i%10;
           i/=10;
        }
        System.out.println(num);
        sc.close();
    }
    
}
