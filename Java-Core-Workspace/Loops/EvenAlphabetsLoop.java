import java.util.Scanner;
public class EvenAlphabetsLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(ch % 2 == 0){

                System.out.println(ch);
            }
        }
        sc.close();
    }
    
}
