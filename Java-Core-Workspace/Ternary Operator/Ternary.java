public class Ternary{
    public static void main(String[] args){

        System.out.println("Check which is greater - ");
        int a = 9, b = 5, c = 4;
        int res = (a > b && a > c ) ? a : (b > c) ? b : c;
        System.out.println(res);

        System.out.println("Check upper case - ");
        char ch1 = 'A';
        String res1 = (ch1 >= 'A' && ch1 <= 'Z' ? "Upper Case" : " Not upper Case");
        System.out.println(res1);

        System.out.println("Check lower case - ");
        char ch2 = 'b';
        String res2 = (ch2 >= 'a' && ch2 <= 'z' ? "Lower Case" : " Not lower Case");
        System.out.println(res2);

        System.out.println("Check Alphabet - ");
        char ch3 = '&';
        String res3 = ((ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= 'a' && ch3 <= 'z')) ? "Is Alphabaet" : "Not alphabet";
        System.out.println(res3);    
        
        System.out.println("Check Digit - ");
        char ch4 = '&';
        String res4 = (ch4 >= 0 && ch4 <= 0)? "Is digit": "Not a digit";
        System.out.println(res4); 
        
        System.out.println("Upercase vowels or consonants - ");
        char ch5 = '&';
        String res5 = (ch5 =='A' || ch5 == 'E' || ch5 =='I' || ch5 == 'O' || ch5 =='U') ? "UpperCase Vowels" : "Not uppercase vowel";
        System.out.println(res5);   

        System.out.println("Lower vowels or consonants - ");
        char ch6 = '&';
        String res6 = (ch6 =='a' || ch6 == 'e' || ch6 =='i' || ch6 == 'o' || ch6 =='u') ? "LowerCase Vowels" : "Not lowercase vowel";
        System.out.println(res6); 

        System.out.println("vowels or consonants - ");
        char ch7 = '&';
        String res7 = (ch7 =='a' || ch7 == 'e' || ch7 =='i' || ch7 == 'o' || ch7 =='u' || ch7 =='A' || ch7 == 'E' || ch7 =='I' || ch7 == 'O' || ch7 =='U')? "Vowels" : "Consonant";
        System.out.println(res7);
        
        System.out.println("check amount - ");
        int a1 = 10000;
        String res8 = (a1 > 1000)? "Withdraw":"Not withdraw";
        System.out.println(res8);

        System.out.println("check even - ");
        int a2 = 5;
        String res9 = (a2 % 2 == 0)? "even":"not even";
        System.out.println(res9);

        System.out.println("check odd - ");
        int a3 = 5;
        String res10 = (a3 % 2 != 0)? "odd":"not odd";
        System.out.println(res10);

        System.out.println("check age - ");
        int a4 = 10000;
        String res11 = (a4 > 18 && a4 < 51)? "Valid Age":"Not valid age";
        System.out.println(res11);

        System.out.println("check positive - ");
        int a5 = 3;
        String res12 = (a5 > 0)? "Positive":"Not positive";
        System.out.println(res12);

        System.out.println("check negative - ");
        int a6 = 3;
        String res13 = (a6 < 0)? "Negative":"Not Negative";
        System.out.println(res13);

        System.out.println("check neutral - ");
        int a8 = 0;
        String res14 = (a8 == 0)? "Neutral":"Not Neutral";
        System.out.println(res14);


    }
}