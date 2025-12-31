import java.util.Scanner;
public class OddNumbersBetweenMandNLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        if(m1 <= n1){
            for(int i = m1; i <= n1; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }   
        }else{
            for(int i = n1; i <= m1; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }  
        }
        sc.close();
    }
    
}
