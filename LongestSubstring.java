
import java.util.*;

public class LongestSubstring {

    public static void Longest(String s, String rev) {
        int n = s.length();
        String longest = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (rev.contains(sub) && sub.length() > longest.length()) {
                    if (new StringBuilder(sub).reverse().toString().equals(sub)) {
                        longest = sub;
                    }
                }
            }
        }
        System.out.println("Longest substring is :" + longest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.next();
        String rev = new StringBuilder(s).reverse().toString();
        Longest(s, rev);
    }
}
