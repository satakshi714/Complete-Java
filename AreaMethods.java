import java.util.Scanner;
public class AreaMethods {
    
    
    public static void main(String[] args){
        
        while(true){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter shape \n1: Square \n2: Rectangle \n3:Circle");
            switch(sc.nextInt()){
                case 1 : System.out.println("Area of square: " + square());
                break;
                case 2 : System.out.println("Area of rectangle: " + rectangle());
                break;
                case 3: System.out.println("Area of circle: " + circle());
                break;
                default: System.out.println("Invalid Choice");
            }
            System.out.println("Do you want to continue\n1 - yes \n2 - no");
            String choice = sc.next();
            if(choice.equals("n")){
                break;
            }
           sc.close();
        }
    }

    public static double square(){
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double area1 = side * side;
    //    sc.close();
        return area1;
    }

    public static double rectangle(){
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double area2 = length * width;
        return area2;


    }
    public static double circle(){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area3 = 3.14 * radius * radius;
        return area3;
    }

}
