
import java.util.*;

public class StringReverse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.next();
        System.out.println("Original string :" + s);
        StringBuffer rev = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        System.out.println("Reversed String :" + rev);
    }
}
