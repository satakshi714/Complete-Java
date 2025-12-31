public class Question{
    public static void main(String[] args){
        m1(m3(100),200);
    }
    public static void m1(int m3, int a){
        System.out.println("m1() -> "+ a);
    }
    public static void m2(){
        System.out.println("m2 method");
    }
    public static int m3(int a){
        System.out.println("m3 -> "+a);
        return a;
    }
}
    