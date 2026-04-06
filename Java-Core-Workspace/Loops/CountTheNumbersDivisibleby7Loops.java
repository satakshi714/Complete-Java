import java.util.Scanner;
public class CountTheNumbersDivisibleby7Loops {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count = 0;
        for(int i = n1; i <= n2; i++){
            if(i % 7 == 0)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
