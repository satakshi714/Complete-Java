import java.util.Scanner;
public class EvenNumbersBetweenMandNLoops {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m <= n){
            for(int i = m; i <= n; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }else{
            for(int i = n; i <= m; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
