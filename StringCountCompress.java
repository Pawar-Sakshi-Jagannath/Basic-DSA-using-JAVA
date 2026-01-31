
import java.util.*;

public class StringCountCompress {

    public static String compress(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int cnt = 0;
            while (i < s.length() && s.charAt(i) == ch) {
                cnt++;
                i++;
            }
            s1.append(ch).append(cnt);
            i--;
        }
        return s1.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.next();
        String res = compress(s);
        System.out.println(res);
    }
}
