import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i++){
            String input = sc.nextLine();
            if(isValid(input)){
                System.out.println("VALID LOG");
            }else{
                System.out.println("INVALID LOG");
            }
        }
    }

    public static boolean isValid(String s){
        String[] parts = s.split("\\|");
        if(parts.length != 5) return false;
        if(!validTransactions(parts[0])) return false;
        else if(!validDate(parts[1])) return false;
        else if(!validCurrency(parts[2])) return false;
        else if(!validAmount(parts[3])) return false;
        else if(!validStatus(parts[4])) return false;
        else return true;
    }

    public static boolean validTransactions(String s){
        if(!s.matches("TXN-\\d{6}")) return false;
        String dig = s.substring(4);
        if(dig.charAt(0)=='0') return false;
        int c = 1;
        for(int i = 1; i < dig.length(); i++){
            if(dig.charAt(i) == dig.charAt(i-1)){
                c++;
                if(c>3) return false;
            }else{
                c=1;
            }
        }
        return true;
    }

    public static boolean validDate(String s){
        if(!s.matches("\\d{4}-\\d{2}-\\d{2}")) return false;
        String[] parts = s.split("-");
        int y = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int d = Integer.parseInt(parts[2]);
        if(y < 2000 || y > 2009 || m < 1 || m > 12) return false;
        int date[] = {31,isLeap(y) ? 29 : 28,31,30,31,30,31,31,30,31,30,31};
        if(d < 1 || d > date[m-1]) return false;
        return true;
            
    }
    public static boolean isLeap(int year){
        return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }
    public static boolean validCurrency(String s){
        if((s.equals("INR") || s.equals("USD")|| s.equals("EUR") || s.equals("GBP") || s.equals("JPY") || s.equals("AUD"))){
            return true;
        }else{
            return false;
        }
    }
    public static boolean validAmount(String s){
        if(!s.matches("(0|[1-9]\\d*)(\\.\\d{1,2})?")) return false;
        double v = Double.parseDouble(s);
        if(v <= 0 && v > 999999.99) return false;
        return true;
    }
    public static boolean validStatus(String s){
        if(!(s.equals("SUCCESS") || s.equals("FAILED") || s.equals("PENDING"))){
            return false;
        }
        return true;
    }

}