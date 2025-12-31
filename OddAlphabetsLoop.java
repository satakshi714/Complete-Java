import java.util.Scanner;
public class OddAlphabetsLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        long product = 1;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(ch % 2 != 0){
                product *= ch;
            }
        }
        System.out.println(product);
        sc.close();
    }
}
