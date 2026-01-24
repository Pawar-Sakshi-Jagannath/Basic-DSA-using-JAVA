
import java.util.*;

public class CountVowelConso {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.next();
        int vcnt = 0, ccnt = 0;
        String s1 = s.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            switch (s1.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vcnt += 1;
                    break;
                default:
                    ccnt += 1;
            }
        }
        System.out.println("String is :" + s + " No. of Vowels :" + vcnt + " No. of consonants :" + ccnt);
    }
}
