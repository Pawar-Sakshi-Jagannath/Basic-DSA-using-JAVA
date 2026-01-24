
import java.util.*;

public class StringPalindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.next();
        StringBuffer rev = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        System.out.println("Reverse :" + rev);
        if (s.equals(rev.toString())) {
            System.out.println(s + " is palindrome");
        } else {
            System.out.println(s + " is not palindrome");
        }
    }
}
