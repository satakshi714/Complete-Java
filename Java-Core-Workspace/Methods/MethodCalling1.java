import java.util.*;
public class MethodCalling1 {
    public static void main(String[] args){

        System.out.println(details());
    }
    public static String details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Contact number: ");
        long contact = sc.nextLong();
        sc.close();
        return name +"\n"+age + "\n"+ contact;
        
    } 
}
