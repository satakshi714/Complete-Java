public class CheckCharOrNumTernaryOperator {
    public static void main(String[] args) {
        char ch='*';
        boolean uc=ch>='A'&&ch<='Z';
        boolean lc=ch>='a'&&ch<='z';
        boolean dig=ch>=0&&ch<=9;
        boolean alp=uc||lc;
        boolean ucv=ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
        boolean lcv=ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';

        String res = (alp ?"alphabet : "+ (uc? "uppercase : " +(ucv? "vowel":"consonant"):"lowercase : "+(lcv?"vowel":"consonant")):(dig?"digit":"special char"));
        System.out.println("Q12: " + res);
    }
    
}
