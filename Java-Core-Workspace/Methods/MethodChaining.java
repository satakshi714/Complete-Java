import java.util.Scanner;
public class MethodChaining {
    public static void main(String[] args){


        addition();
        
        
    }

    public static void addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for addition");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum= a+b;
        System.out.println(sum);
        subtraction();
        sc.close();
    }
    public static void subtraction(){
        System.out.println("Enter 2 numbers for subtraction");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = a-b;
        System.out.println(diff);
        multiplication();
        sc.close();
    }
    public static void multiplication(){
        System.out.println("Enter 2 numbers for multiplication");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println(product);
        sc.close();
    }
}



