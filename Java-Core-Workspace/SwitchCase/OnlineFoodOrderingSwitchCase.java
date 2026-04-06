import java.util.Scanner;

public class OnlineFoodOrderingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Cuisine:");
        System.out.println("1. South Indian");
        System.out.println("2. North Indian");
        System.out.println("3. Chinese");
        System.out.println("4. Italian");

        int cuisine = sc.nextInt();
        int item, qty;
        double price = 0;

        switch (cuisine) {
            case 1:
                System.out.println("South Indian Menu");
                System.out.println("1. Dosa - 60");
                System.out.println("2. Idli - 40");
                System.out.println("3. Vada - 50");

                item = sc.nextInt();
                qty = sc.nextInt();

                switch (item) {
                    case 1: price = 60; break;
                    case 2: price = 40; break;
                    case 3: price = 50; break;
                    default: System.out.println("Invalid item");
                }
                break;

            case 2:
                System.out.println("North Indian Menu");
                System.out.println("1. Paneer Butter Masala - 180");
                System.out.println("2. Roti - 20");
                System.out.println("3. Dal Fry - 120");

                item = sc.nextInt();
                qty = sc.nextInt();

                switch (item) {
                    case 1: price = 180; break;
                    case 2: price = 20; break;
                    case 3: price = 120; break;
                    default: System.out.println("Invalid item");
                }
                break;

            case 3:
                System.out.println("Chinese Menu");
                System.out.println("1. Noodles - 100");
                System.out.println("2. Fried Rice - 120");
                System.out.println("3. Manchurian - 140");

                item = sc.nextInt();
                qty = sc.nextInt();

                switch (item) {
                    case 1: price = 100; break;
                    case 2: price = 120; break;
                    case 3: price = 140; break;
                    default: System.out.println("Invalid item");
                }
                break;

            case 4:
                System.out.println("Italian Menu");
                System.out.println("1. Pizza - 250");
                System.out.println("2. Pasta - 200");
                System.out.println("3. Garlic Bread - 150");

                item = sc.nextInt();
                qty = sc.nextInt();

                switch (item) {
                    case 1: price = 250; break;
                    case 2: price = 200; break;
                    case 3: price = 150; break;
                    default: System.out.println("Invalid item");
                }
                break;

            default:
                System.out.println("Invalid cuisine choice");
                sc.close();
                return;
        }

        double total = price * qty;
        System.out.println("Total Bill: " + total);

        sc.close();
    }
}
