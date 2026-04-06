import java.util.Scanner;
public class TypeCasting {
	public static void main(String[] args){
		 	Scanner sc = new Scanner(System.in);
                byte b1 = sc.nextByte();
                short s1= sc.nextByte();
                int i1 = sc.nextByte();
                long l1 = sc.nextByte();
                float f1 = sc.nextByte();
                double d1 = sc.nextByte();
                System.out.println("Implicit short : " + s1);
                System.out.println("Implicit int : " + i1);
                System.out.println("Implicit long : " + l1);
                System.out.println("Implicit float : " + f1);
                System.out.println("Implicit double : " + d1);

                double d2 = sc.nextDouble();
                float f2 = (float)sc.nextDouble();
                long l2 = (long)sc.nextDouble();
                int i2 = (int) sc.nextDouble();
                short s2 = (short)sc.nextDouble();
                byte b2 = (byte)sc.nextDouble();
                System.out.println("Explicit float : " + f2);
                System.out.println("Explicit long : " + l2);
                System.out.println("Explicit int : " + i2);
                System.out.println("Explicit short : " + s2);
                System.out.println("Explicit byte : " + b2); 

                sc.close();

	}    
}
