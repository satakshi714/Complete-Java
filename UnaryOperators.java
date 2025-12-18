public class UnaryOperators {
    public static void main(String[] args) {
        // int a = -10;
        // int b = -5 + ++a;
        // a = ++b +b -b + ++b;
        // int c = ++a - ++b -10+5;
        // b = ++a + ++c;
        // System.out.println(a );
        // System.out.println(b );
        // ++b;
        // System.out.println(c );
        
        // int a = -5;
        // int b = a++ + 5;
        // int c = b++ + a++ + 5;
        // a = c++ + c + 5;
        // System.out.println(a++ );
        // System.out.println(b );
        // System.out.println(c ++);
        // System.out.println(a );

        // int a = 10;
        // int b = a++ - ++a;
        // int c= a++ + ++b - ++a + b;
        // a = c++ + ++b - c + ++c;
        // System.out.println(a );
        // System.out.println(b );
        // System.out.println(c ++);

        // int a = 10;
        // --a;
        // int b = --a+ ++a + a;
        // int c = a++ - ++b - --a -a;
        // a= c-- + --b - c++ + c;
        // System.out.println(a );
        // System.out.println(b );
        // System.out.println(c );


        char ch = 'm';
        System.out.println(ch++);
        System.out.println(++ch);
        System.out.println(--ch);
        System.out.println(ch--);
        System.out.println(ch);
        System.out.println(ch--);
        System.out.println(--ch);

        
    }
    
}
