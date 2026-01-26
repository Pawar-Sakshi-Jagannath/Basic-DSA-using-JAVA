
import java.util.*;

public class TwoConsequetive {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                i++;
                continue;
            } else {
                System.out.println(s.charAt(i) + " is first non-repeating character");
                break;
            }
        }
    }
}
