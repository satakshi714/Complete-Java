import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < n; i++){
            String input = sc.nextLine();
            if(isValid(input)){
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
        }
    }
    public static boolean isValid(String s){
        String[] parts = s.split("#");
        if(parts.length != 5) return false;
        if(!validCode(parts[0])) return false;
        else if(!validDate(parts[1])) return false;
        else if(!validMode(parts[2])) return false;
        else if(!validWeight(parts[3])) return false;
        else if(!validStatus(parts[4])) return false;
        else return true;
    }
    public static boolean validCode(String s){
        if(!s.matches("SHP-[A-Z]{2}\\d{4}")) return false;
        String letters = s.substring(4, 6); // only 2 letters
        int count = 1;

        for(int i = 1; i < letters.length(); i++){
            if(letters.charAt(i) == letters.charAt(i-1)){
                count++;
                if(count > 2) return false;
            } else {
                count = 1;
            }
        }
        return true;
    }
    public static boolean validDate(String s){
        if(!s.matches("\\d{4}/\\d{2}/\\d{2}")) return false;
        String[] parts = s.split("/");
        int y = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int d = Integer.parseInt(parts[2]);
        if(y < 2020 || y > 2025 || m < 1 || m > 12) return false;
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(d < 1 || d > days[m-1]) return false;
        return true;
    }
    public static boolean validMode(String s){
        if(!(s.equals("AIR") || s.equals("SEA") || s.equals("LAND"))) return false;
        return true;
    }
    public static boolean validWeight(String s){
        if(!s.matches("(0\\.[1-9]\\d?|[1-9]\\d*(\\.\\d{1,2})?)")) return false;
        double v = Double.parseDouble(s);
        if(v < 0.1 || v > 1000) return false;
        return true;
    }
    public static boolean validStatus(String s){
         if(!(s.equals("DELIVERED") || s.equals("IN_TRANSIT") || s.equals("CANCELLED") || s.equals("RETURNED"))) return false;
        return true;
    }

}
