@FunctionalInterface
interface Printer{
    void print(String message);
}
public class LambdaOneParameter {
    public static void main(String[] args){
        Printer p = msg -> System.out.println("Message: "+ msg);
        p.print("Learning lambda is fun!!!");
    }
}
