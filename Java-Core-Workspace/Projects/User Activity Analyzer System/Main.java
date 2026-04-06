import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        int N = sc.nextInt();
        for(int i = 0 ; i < N; i++){
            data.add(sc.nextLine());
            if(isValid(data)){
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
        }
    }
    public static boolean isValid(ArrayList<String> data){
        
    }
}
