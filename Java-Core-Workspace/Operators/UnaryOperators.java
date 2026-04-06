public class UnaryOperators {
    public static void main(String[] args) {
        int a = -10;
        int b = -5 + ++a;
        a = ++b +b -b + ++b;
        int c = ++a - ++b -10+5;
        b = ++a + ++c;
        System.out.println(a );
        System.out.println(b );
        ++b;
        System.out.println(c );
        
        int a1 = -5;
        int b1 = a1++ + 5;
        int c1 = b1++ + a1++ + 5;
        a1 = c1++ + c1 + 5;
        System.out.println(a1++);
        System.out.println(b1);
        System.out.println(c1++);
        System.out.println(a1);

        int a2 = 10;
        int b2 = a2++ - ++a2;
        int c2= a2++ + ++b2 - ++a2 + b2;
        a2 = c2++ + ++b2 - c2 + ++c2;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2++);

        int a3 = 10;
        --a3;
        int b3 = --a3+ ++a3 + a3;
        int c3 = a3++ - ++b3 - --a3 -a3;
        a3 = c3-- + --b3 - c3++ + c3;
        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);


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
