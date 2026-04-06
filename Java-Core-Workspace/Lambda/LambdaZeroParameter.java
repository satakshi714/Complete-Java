@FunctionalInterface
interface Greeting{
    void sayHello();
}
public class LambdaZeroParameter {
    public static void main(String[] args) {
        //Traditional Anonymous class (long)
        // Greeting g = new Greeting(){
        //     public void sayHello(){
        //          System.out.println("Hello!");
        //     }
        // };

        // Lambda Expression
        Greeting g = () -> System.out.println("Hello!");
        g.sayHello();
    }
}
