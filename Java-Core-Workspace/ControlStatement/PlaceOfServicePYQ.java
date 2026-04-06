import java.util.Scanner;
public class PlaceOfServicePYQ {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter gender(M or F)");
        char gender = sc.next().charAt(0);
        if(gender == 'F'){
            System.out.println("Work in urban areas");
        }else if(gender == 'M' && age >= 40 && age <= 60){
            System.out.println("Work in urban areas");
        }else if(gender == 'M' && age >= 20&& age <40){
            System.out.println("Work Anywhere");
        }else{
            System.out.println("ERROR");
        }
        sc.close();
    }
}
