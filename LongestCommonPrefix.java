
import java.util.*;

public class LongestCommonPrefix {

    public static String lcp(String[] words) {
        if (words.length == 0) {
            return "";
        }
        String first = words[0];
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (i >= words.length || words[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of strings :");
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.println("Enter all stribgs :");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        String longest = lcp(words);
        System.out.println("Longest Common prefix :" + longest);
    }
}
